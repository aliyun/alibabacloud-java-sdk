// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateBalanceTransactionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterCreateBalanceTransactionResponseBody body;

    public static ModelRouterCreateBalanceTransactionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateBalanceTransactionResponse self = new ModelRouterCreateBalanceTransactionResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateBalanceTransactionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterCreateBalanceTransactionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterCreateBalanceTransactionResponse setBody(ModelRouterCreateBalanceTransactionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterCreateBalanceTransactionResponseBody getBody() {
        return this.body;
    }

}
