// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterBatchCreateModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterBatchCreateModelResponseBody body;

    public static ModelRouterBatchCreateModelResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterBatchCreateModelResponse self = new ModelRouterBatchCreateModelResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterBatchCreateModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterBatchCreateModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterBatchCreateModelResponse setBody(ModelRouterBatchCreateModelResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterBatchCreateModelResponseBody getBody() {
        return this.body;
    }

}
