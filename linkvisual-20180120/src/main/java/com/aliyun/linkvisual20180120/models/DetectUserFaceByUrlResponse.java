// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DetectUserFaceByUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectUserFaceByUrlResponseBody body;

    public static DetectUserFaceByUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectUserFaceByUrlResponse self = new DetectUserFaceByUrlResponse();
        return TeaModel.build(map, self);
    }

    public DetectUserFaceByUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectUserFaceByUrlResponse setBody(DetectUserFaceByUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectUserFaceByUrlResponseBody getBody() {
        return this.body;
    }

}
