// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateModelGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterCreateModelGroupResponseBody body;

    public static ModelRouterCreateModelGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateModelGroupResponse self = new ModelRouterCreateModelGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateModelGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterCreateModelGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterCreateModelGroupResponse setBody(ModelRouterCreateModelGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterCreateModelGroupResponseBody getBody() {
        return this.body;
    }

}
