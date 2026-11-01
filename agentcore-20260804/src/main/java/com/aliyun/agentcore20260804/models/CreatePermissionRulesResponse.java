// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreatePermissionRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePermissionRulesResponseBody body;

    public static CreatePermissionRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePermissionRulesResponse self = new CreatePermissionRulesResponse();
        return TeaModel.build(map, self);
    }

    public CreatePermissionRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePermissionRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePermissionRulesResponse setBody(CreatePermissionRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePermissionRulesResponseBody getBody() {
        return this.body;
    }

}
