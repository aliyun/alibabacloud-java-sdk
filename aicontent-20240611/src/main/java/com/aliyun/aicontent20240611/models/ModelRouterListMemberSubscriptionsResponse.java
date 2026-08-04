// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterListMemberSubscriptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterListMemberSubscriptionsResponseBody body;

    public static ModelRouterListMemberSubscriptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterListMemberSubscriptionsResponse self = new ModelRouterListMemberSubscriptionsResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterListMemberSubscriptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterListMemberSubscriptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterListMemberSubscriptionsResponse setBody(ModelRouterListMemberSubscriptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterListMemberSubscriptionsResponseBody getBody() {
        return this.body;
    }

}
