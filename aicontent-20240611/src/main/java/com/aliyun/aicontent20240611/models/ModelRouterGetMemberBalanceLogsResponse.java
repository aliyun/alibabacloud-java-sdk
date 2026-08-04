// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterGetMemberBalanceLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterGetMemberBalanceLogsResponseBody body;

    public static ModelRouterGetMemberBalanceLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterGetMemberBalanceLogsResponse self = new ModelRouterGetMemberBalanceLogsResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterGetMemberBalanceLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterGetMemberBalanceLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterGetMemberBalanceLogsResponse setBody(ModelRouterGetMemberBalanceLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterGetMemberBalanceLogsResponseBody getBody() {
        return this.body;
    }

}
