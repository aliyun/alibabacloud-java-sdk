// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AddUserToAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddUserToAuthorizationRuleResponseBody body;

    public static AddUserToAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserToAuthorizationRuleResponse self = new AddUserToAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddUserToAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserToAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUserToAuthorizationRuleResponse setBody(AddUserToAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserToAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
