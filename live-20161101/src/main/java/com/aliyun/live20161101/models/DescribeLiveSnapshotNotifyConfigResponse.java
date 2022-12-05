// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveSnapshotNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveSnapshotNotifyConfigResponseBody body;

    public static DescribeLiveSnapshotNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveSnapshotNotifyConfigResponse self = new DescribeLiveSnapshotNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveSnapshotNotifyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveSnapshotNotifyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveSnapshotNotifyConfigResponse setBody(DescribeLiveSnapshotNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveSnapshotNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
