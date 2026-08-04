// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterExportMemberBalanceOrdersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterExportMemberBalanceOrdersResponseBody body;

    public static ModelRouterExportMemberBalanceOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterExportMemberBalanceOrdersResponse self = new ModelRouterExportMemberBalanceOrdersResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterExportMemberBalanceOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterExportMemberBalanceOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterExportMemberBalanceOrdersResponse setBody(ModelRouterExportMemberBalanceOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterExportMemberBalanceOrdersResponseBody getBody() {
        return this.body;
    }

}
