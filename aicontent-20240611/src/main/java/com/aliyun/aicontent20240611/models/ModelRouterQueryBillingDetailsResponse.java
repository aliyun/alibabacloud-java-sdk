// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryBillingDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryBillingDetailsResponseBody body;

    public static ModelRouterQueryBillingDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryBillingDetailsResponse self = new ModelRouterQueryBillingDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryBillingDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryBillingDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryBillingDetailsResponse setBody(ModelRouterQueryBillingDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryBillingDetailsResponseBody getBody() {
        return this.body;
    }

}
