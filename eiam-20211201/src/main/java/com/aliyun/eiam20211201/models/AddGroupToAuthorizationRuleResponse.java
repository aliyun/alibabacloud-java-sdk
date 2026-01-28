// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AddGroupToAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddGroupToAuthorizationRuleResponseBody body;

    public static AddGroupToAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGroupToAuthorizationRuleResponse self = new AddGroupToAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddGroupToAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGroupToAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGroupToAuthorizationRuleResponse setBody(AddGroupToAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGroupToAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
