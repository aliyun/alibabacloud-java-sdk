// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateMemberSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterCreateMemberSubscriptionResponseBody body;

    public static ModelRouterCreateMemberSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateMemberSubscriptionResponse self = new ModelRouterCreateMemberSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateMemberSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterCreateMemberSubscriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterCreateMemberSubscriptionResponse setBody(ModelRouterCreateMemberSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterCreateMemberSubscriptionResponseBody getBody() {
        return this.body;
    }

}
