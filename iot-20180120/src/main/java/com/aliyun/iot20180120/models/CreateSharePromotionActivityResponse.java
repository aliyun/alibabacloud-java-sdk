// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSharePromotionActivityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSharePromotionActivityResponseBody body;

    public static CreateSharePromotionActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSharePromotionActivityResponse self = new CreateSharePromotionActivityResponse();
        return TeaModel.build(map, self);
    }

    public CreateSharePromotionActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSharePromotionActivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSharePromotionActivityResponse setBody(CreateSharePromotionActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSharePromotionActivityResponseBody getBody() {
        return this.body;
    }

}
