// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterUpdateBillingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterUpdateBillingRuleResponseBody body;

    public static ModelRouterUpdateBillingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterUpdateBillingRuleResponse self = new ModelRouterUpdateBillingRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterUpdateBillingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterUpdateBillingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterUpdateBillingRuleResponse setBody(ModelRouterUpdateBillingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterUpdateBillingRuleResponseBody getBody() {
        return this.body;
    }

}
