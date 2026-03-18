// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryModelListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryModelListResponseBody body;

    public static ModelRouterQueryModelListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryModelListResponse self = new ModelRouterQueryModelListResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryModelListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryModelListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryModelListResponse setBody(ModelRouterQueryModelListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryModelListResponseBody getBody() {
        return this.body;
    }

}
