// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryClientListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryClientListResponseBody body;

    public static ModelRouterQueryClientListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryClientListResponse self = new ModelRouterQueryClientListResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryClientListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryClientListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryClientListResponse setBody(ModelRouterQueryClientListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryClientListResponseBody getBody() {
        return this.body;
    }

}
