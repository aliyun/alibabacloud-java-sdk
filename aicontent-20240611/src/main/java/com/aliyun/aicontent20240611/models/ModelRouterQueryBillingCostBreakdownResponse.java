// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryBillingCostBreakdownResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryBillingCostBreakdownResponseBody body;

    public static ModelRouterQueryBillingCostBreakdownResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryBillingCostBreakdownResponse self = new ModelRouterQueryBillingCostBreakdownResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryBillingCostBreakdownResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryBillingCostBreakdownResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryBillingCostBreakdownResponse setBody(ModelRouterQueryBillingCostBreakdownResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryBillingCostBreakdownResponseBody getBody() {
        return this.body;
    }

}
