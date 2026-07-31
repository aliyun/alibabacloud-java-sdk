// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterDeleteModelGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterDeleteModelGroupResponseBody body;

    public static ModelRouterDeleteModelGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterDeleteModelGroupResponse self = new ModelRouterDeleteModelGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterDeleteModelGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterDeleteModelGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterDeleteModelGroupResponse setBody(ModelRouterDeleteModelGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterDeleteModelGroupResponseBody getBody() {
        return this.body;
    }

}
