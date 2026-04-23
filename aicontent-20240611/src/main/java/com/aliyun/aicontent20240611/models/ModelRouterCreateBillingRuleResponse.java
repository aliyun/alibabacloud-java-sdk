// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateBillingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterCreateBillingRuleResponseBody body;

    public static ModelRouterCreateBillingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateBillingRuleResponse self = new ModelRouterCreateBillingRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateBillingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterCreateBillingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterCreateBillingRuleResponse setBody(ModelRouterCreateBillingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterCreateBillingRuleResponseBody getBody() {
        return this.body;
    }

}
