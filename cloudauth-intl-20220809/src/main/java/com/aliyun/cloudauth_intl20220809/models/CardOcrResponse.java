// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CardOcrResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CardOcrResponseBody body;

    public static CardOcrResponse build(java.util.Map<String, ?> map) throws Exception {
        CardOcrResponse self = new CardOcrResponse();
        return TeaModel.build(map, self);
    }

    public CardOcrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CardOcrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CardOcrResponse setBody(CardOcrResponseBody body) {
        this.body = body;
        return this;
    }
    public CardOcrResponseBody getBody() {
        return this.body;
    }

}
