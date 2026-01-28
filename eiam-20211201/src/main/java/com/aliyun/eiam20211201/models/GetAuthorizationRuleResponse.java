// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuthorizationRuleResponseBody body;

    public static GetAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationRuleResponse self = new GetAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuthorizationRuleResponse setBody(GetAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
