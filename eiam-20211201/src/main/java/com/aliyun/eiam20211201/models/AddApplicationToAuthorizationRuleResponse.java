// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AddApplicationToAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddApplicationToAuthorizationRuleResponseBody body;

    public static AddApplicationToAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddApplicationToAuthorizationRuleResponse self = new AddApplicationToAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddApplicationToAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddApplicationToAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddApplicationToAuthorizationRuleResponse setBody(AddApplicationToAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddApplicationToAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
