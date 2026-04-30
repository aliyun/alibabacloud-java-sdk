// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterGetClientBalanceLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterGetClientBalanceLogsResponseBody body;

    public static ModelRouterGetClientBalanceLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterGetClientBalanceLogsResponse self = new ModelRouterGetClientBalanceLogsResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterGetClientBalanceLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterGetClientBalanceLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterGetClientBalanceLogsResponse setBody(ModelRouterGetClientBalanceLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterGetClientBalanceLogsResponseBody getBody() {
        return this.body;
    }

}
