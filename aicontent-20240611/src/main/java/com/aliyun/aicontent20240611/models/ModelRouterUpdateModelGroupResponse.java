// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterUpdateModelGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterUpdateModelGroupResponseBody body;

    public static ModelRouterUpdateModelGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterUpdateModelGroupResponse self = new ModelRouterUpdateModelGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterUpdateModelGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterUpdateModelGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterUpdateModelGroupResponse setBody(ModelRouterUpdateModelGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterUpdateModelGroupResponseBody getBody() {
        return this.body;
    }

}
