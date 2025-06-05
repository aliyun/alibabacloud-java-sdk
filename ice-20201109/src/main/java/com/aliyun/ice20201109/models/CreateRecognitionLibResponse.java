// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateRecognitionLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRecognitionLibResponseBody body;

    public static CreateRecognitionLibResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRecognitionLibResponse self = new CreateRecognitionLibResponse();
        return TeaModel.build(map, self);
    }

    public CreateRecognitionLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRecognitionLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRecognitionLibResponse setBody(CreateRecognitionLibResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRecognitionLibResponseBody getBody() {
        return this.body;
    }

}
