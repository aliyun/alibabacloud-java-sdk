// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeletePermissionRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePermissionRuleResponseBody body;

    public static DeletePermissionRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePermissionRuleResponse self = new DeletePermissionRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeletePermissionRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePermissionRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePermissionRuleResponse setBody(DeletePermissionRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePermissionRuleResponseBody getBody() {
        return this.body;
    }

}
