// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterListBalanceOrdersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterListBalanceOrdersResponseBody body;

    public static ModelRouterListBalanceOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterListBalanceOrdersResponse self = new ModelRouterListBalanceOrdersResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterListBalanceOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterListBalanceOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterListBalanceOrdersResponse setBody(ModelRouterListBalanceOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterListBalanceOrdersResponseBody getBody() {
        return this.body;
    }

}
