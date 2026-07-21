// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterCreateSubscriptionResponseBody body;

    public static ModelRouterCreateSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateSubscriptionResponse self = new ModelRouterCreateSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterCreateSubscriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterCreateSubscriptionResponse setBody(ModelRouterCreateSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterCreateSubscriptionResponseBody getBody() {
        return this.body;
    }

}
