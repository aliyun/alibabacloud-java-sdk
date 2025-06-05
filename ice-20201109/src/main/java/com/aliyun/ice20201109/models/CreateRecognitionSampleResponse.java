// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateRecognitionSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRecognitionSampleResponseBody body;

    public static CreateRecognitionSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRecognitionSampleResponse self = new CreateRecognitionSampleResponse();
        return TeaModel.build(map, self);
    }

    public CreateRecognitionSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRecognitionSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRecognitionSampleResponse setBody(CreateRecognitionSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRecognitionSampleResponseBody getBody() {
        return this.body;
    }

}
