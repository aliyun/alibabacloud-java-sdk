// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryUserListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryUserListResponseBody body;

    public static ModelRouterQueryUserListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryUserListResponse self = new ModelRouterQueryUserListResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryUserListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryUserListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryUserListResponse setBody(ModelRouterQueryUserListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryUserListResponseBody getBody() {
        return this.body;
    }

}
