// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryModelGroupClientsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryModelGroupClientsResponseBody body;

    public static ModelRouterQueryModelGroupClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryModelGroupClientsResponse self = new ModelRouterQueryModelGroupClientsResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryModelGroupClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryModelGroupClientsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryModelGroupClientsResponse setBody(ModelRouterQueryModelGroupClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryModelGroupClientsResponseBody getBody() {
        return this.body;
    }

}
