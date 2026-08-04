// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterListMemberBalanceOrdersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterListMemberBalanceOrdersResponseBody body;

    public static ModelRouterListMemberBalanceOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterListMemberBalanceOrdersResponse self = new ModelRouterListMemberBalanceOrdersResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterListMemberBalanceOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterListMemberBalanceOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterListMemberBalanceOrdersResponse setBody(ModelRouterListMemberBalanceOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterListMemberBalanceOrdersResponseBody getBody() {
        return this.body;
    }

}
