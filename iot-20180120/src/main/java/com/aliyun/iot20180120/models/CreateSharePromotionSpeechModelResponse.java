// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSharePromotionSpeechModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSharePromotionSpeechModelResponseBody body;

    public static CreateSharePromotionSpeechModelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSharePromotionSpeechModelResponse self = new CreateSharePromotionSpeechModelResponse();
        return TeaModel.build(map, self);
    }

    public CreateSharePromotionSpeechModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSharePromotionSpeechModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSharePromotionSpeechModelResponse setBody(CreateSharePromotionSpeechModelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSharePromotionSpeechModelResponseBody getBody() {
        return this.body;
    }

}
