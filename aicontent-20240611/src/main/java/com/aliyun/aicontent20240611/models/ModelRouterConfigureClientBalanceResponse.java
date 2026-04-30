// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterConfigureClientBalanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterConfigureClientBalanceResponseBody body;

    public static ModelRouterConfigureClientBalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterConfigureClientBalanceResponse self = new ModelRouterConfigureClientBalanceResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterConfigureClientBalanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterConfigureClientBalanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterConfigureClientBalanceResponse setBody(ModelRouterConfigureClientBalanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterConfigureClientBalanceResponseBody getBody() {
        return this.body;
    }

}
