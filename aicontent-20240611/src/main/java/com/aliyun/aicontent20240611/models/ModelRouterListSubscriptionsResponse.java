// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterListSubscriptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterListSubscriptionsResponseBody body;

    public static ModelRouterListSubscriptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterListSubscriptionsResponse self = new ModelRouterListSubscriptionsResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterListSubscriptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterListSubscriptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterListSubscriptionsResponse setBody(ModelRouterListSubscriptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterListSubscriptionsResponseBody getBody() {
        return this.body;
    }

}
