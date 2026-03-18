// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterCreateModelResponseBody body;

    public static ModelRouterCreateModelResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateModelResponse self = new ModelRouterCreateModelResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterCreateModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterCreateModelResponse setBody(ModelRouterCreateModelResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterCreateModelResponseBody getBody() {
        return this.body;
    }

}
