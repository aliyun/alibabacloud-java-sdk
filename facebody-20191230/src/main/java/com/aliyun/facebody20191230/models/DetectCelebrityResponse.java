// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectCelebrityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectCelebrityResponseBody body;

    public static DetectCelebrityResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectCelebrityResponse self = new DetectCelebrityResponse();
        return TeaModel.build(map, self);
    }

    public DetectCelebrityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectCelebrityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectCelebrityResponse setBody(DetectCelebrityResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectCelebrityResponseBody getBody() {
        return this.body;
    }

}
