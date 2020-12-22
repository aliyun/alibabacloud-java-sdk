// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectCelebrityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DetectCelebrityResponse setBody(DetectCelebrityResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectCelebrityResponseBody getBody() {
        return this.body;
    }

}
