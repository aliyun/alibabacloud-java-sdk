// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayQuotaRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayQuotaRulesResponseBody body;

    public static ListGatewayQuotaRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayQuotaRulesResponse self = new ListGatewayQuotaRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayQuotaRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayQuotaRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayQuotaRulesResponse setBody(ListGatewayQuotaRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayQuotaRulesResponseBody getBody() {
        return this.body;
    }

}
