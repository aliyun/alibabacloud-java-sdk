// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterSaveFlowConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterSaveFlowConfigResponseBody body;

    public static ModelRouterSaveFlowConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterSaveFlowConfigResponse self = new ModelRouterSaveFlowConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterSaveFlowConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterSaveFlowConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterSaveFlowConfigResponse setBody(ModelRouterSaveFlowConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterSaveFlowConfigResponseBody getBody() {
        return this.body;
    }

}
