// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryModelGroupUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryModelGroupUsersResponseBody body;

    public static ModelRouterQueryModelGroupUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryModelGroupUsersResponse self = new ModelRouterQueryModelGroupUsersResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryModelGroupUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryModelGroupUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryModelGroupUsersResponse setBody(ModelRouterQueryModelGroupUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryModelGroupUsersResponseBody getBody() {
        return this.body;
    }

}
