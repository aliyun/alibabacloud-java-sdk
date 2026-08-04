// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterStopMemberSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterStopMemberSubscriptionResponseBody body;

    public static ModelRouterStopMemberSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterStopMemberSubscriptionResponse self = new ModelRouterStopMemberSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterStopMemberSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterStopMemberSubscriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterStopMemberSubscriptionResponse setBody(ModelRouterStopMemberSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterStopMemberSubscriptionResponseBody getBody() {
        return this.body;
    }

}
