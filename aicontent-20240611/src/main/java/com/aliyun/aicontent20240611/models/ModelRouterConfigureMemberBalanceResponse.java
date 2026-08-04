// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterConfigureMemberBalanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterConfigureMemberBalanceResponseBody body;

    public static ModelRouterConfigureMemberBalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterConfigureMemberBalanceResponse self = new ModelRouterConfigureMemberBalanceResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterConfigureMemberBalanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterConfigureMemberBalanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterConfigureMemberBalanceResponse setBody(ModelRouterConfigureMemberBalanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterConfigureMemberBalanceResponseBody getBody() {
        return this.body;
    }

}
