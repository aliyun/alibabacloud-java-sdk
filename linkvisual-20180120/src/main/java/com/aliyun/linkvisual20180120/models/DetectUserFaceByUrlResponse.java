// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DetectUserFaceByUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DetectUserFaceByUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectUserFaceByUrlResponse setBody(DetectUserFaceByUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectUserFaceByUrlResponseBody getBody() {
        return this.body;
    }

}
