// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryModelGroupListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryModelGroupListResponseBody body;

    public static ModelRouterQueryModelGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryModelGroupListResponse self = new ModelRouterQueryModelGroupListResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryModelGroupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryModelGroupListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryModelGroupListResponse setBody(ModelRouterQueryModelGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryModelGroupListResponseBody getBody() {
        return this.body;
    }

}
