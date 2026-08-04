// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterGetMemberBalanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterGetMemberBalanceResponseBody body;

    public static ModelRouterGetMemberBalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterGetMemberBalanceResponse self = new ModelRouterGetMemberBalanceResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterGetMemberBalanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterGetMemberBalanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterGetMemberBalanceResponse setBody(ModelRouterGetMemberBalanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterGetMemberBalanceResponseBody getBody() {
        return this.body;
    }

}
