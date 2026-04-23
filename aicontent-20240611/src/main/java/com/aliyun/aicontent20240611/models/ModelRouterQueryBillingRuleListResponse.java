// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryBillingRuleListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryBillingRuleListResponseBody body;

    public static ModelRouterQueryBillingRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryBillingRuleListResponse self = new ModelRouterQueryBillingRuleListResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryBillingRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryBillingRuleListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryBillingRuleListResponse setBody(ModelRouterQueryBillingRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryBillingRuleListResponseBody getBody() {
        return this.body;
    }

}
