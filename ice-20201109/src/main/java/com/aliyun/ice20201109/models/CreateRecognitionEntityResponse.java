// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateRecognitionEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRecognitionEntityResponseBody body;

    public static CreateRecognitionEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRecognitionEntityResponse self = new CreateRecognitionEntityResponse();
        return TeaModel.build(map, self);
    }

    public CreateRecognitionEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRecognitionEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRecognitionEntityResponse setBody(CreateRecognitionEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRecognitionEntityResponseBody getBody() {
        return this.body;
    }

}
