// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveSnapshotDetectPornConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveSnapshotDetectPornConfigResponseBody body;

    public static DescribeLiveSnapshotDetectPornConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveSnapshotDetectPornConfigResponse self = new DescribeLiveSnapshotDetectPornConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveSnapshotDetectPornConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveSnapshotDetectPornConfigResponse setBody(DescribeLiveSnapshotDetectPornConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveSnapshotDetectPornConfigResponseBody getBody() {
        return this.body;
    }

}
