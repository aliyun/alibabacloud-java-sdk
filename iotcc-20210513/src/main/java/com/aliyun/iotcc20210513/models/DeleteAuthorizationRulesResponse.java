// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteAuthorizationRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAuthorizationRulesResponseBody body;

    public static DeleteAuthorizationRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthorizationRulesResponse self = new DeleteAuthorizationRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAuthorizationRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAuthorizationRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAuthorizationRulesResponse setBody(DeleteAuthorizationRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAuthorizationRulesResponseBody getBody() {
        return this.body;
    }

}
