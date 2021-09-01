// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DetectImageSyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectImageSyncResponseBody body;

    public static DetectImageSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectImageSyncResponse self = new DetectImageSyncResponse();
        return TeaModel.build(map, self);
    }

    public DetectImageSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectImageSyncResponse setBody(DetectImageSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectImageSyncResponseBody getBody() {
        return this.body;
    }

}
