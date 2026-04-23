// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterBillingCostTabsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterBillingCostTabsResponseBody body;

    public static ModelRouterBillingCostTabsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterBillingCostTabsResponse self = new ModelRouterBillingCostTabsResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterBillingCostTabsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterBillingCostTabsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterBillingCostTabsResponse setBody(ModelRouterBillingCostTabsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterBillingCostTabsResponseBody getBody() {
        return this.body;
    }

}
