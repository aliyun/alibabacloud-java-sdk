// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveSnapshotConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveSnapshotConfigResponseBody body;

    public static DescribeLiveSnapshotConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveSnapshotConfigResponse self = new DescribeLiveSnapshotConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveSnapshotConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveSnapshotConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveSnapshotConfigResponse setBody(DescribeLiveSnapshotConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveSnapshotConfigResponseBody getBody() {
        return this.body;
    }

}
