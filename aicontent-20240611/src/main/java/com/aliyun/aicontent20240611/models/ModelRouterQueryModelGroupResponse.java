// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryModelGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryModelGroupResponseBody body;

    public static ModelRouterQueryModelGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryModelGroupResponse self = new ModelRouterQueryModelGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryModelGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryModelGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryModelGroupResponse setBody(ModelRouterQueryModelGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryModelGroupResponseBody getBody() {
        return this.body;
    }

}
