// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterBatchBindModelGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterBatchBindModelGroupResponseBody body;

    public static ModelRouterBatchBindModelGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterBatchBindModelGroupResponse self = new ModelRouterBatchBindModelGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterBatchBindModelGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterBatchBindModelGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterBatchBindModelGroupResponse setBody(ModelRouterBatchBindModelGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterBatchBindModelGroupResponseBody getBody() {
        return this.body;
    }

}
