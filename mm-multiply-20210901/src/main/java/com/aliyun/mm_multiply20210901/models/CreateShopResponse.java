// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CreateShopResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateShopResponseBody body;

    public static CreateShopResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateShopResponse self = new CreateShopResponse();
        return TeaModel.build(map, self);
    }

    public CreateShopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateShopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateShopResponse setBody(CreateShopResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateShopResponseBody getBody() {
        return this.body;
    }

}
