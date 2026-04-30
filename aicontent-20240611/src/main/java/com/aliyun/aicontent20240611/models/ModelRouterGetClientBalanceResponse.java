// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterGetClientBalanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterGetClientBalanceResponseBody body;

    public static ModelRouterGetClientBalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterGetClientBalanceResponse self = new ModelRouterGetClientBalanceResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterGetClientBalanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterGetClientBalanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterGetClientBalanceResponse setBody(ModelRouterGetClientBalanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterGetClientBalanceResponseBody getBody() {
        return this.body;
    }

}
