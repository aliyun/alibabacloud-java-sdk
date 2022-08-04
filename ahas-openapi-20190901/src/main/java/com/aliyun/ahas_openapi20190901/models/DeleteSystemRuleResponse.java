// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DeleteSystemRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSystemRuleResponseBody body;

    public static DeleteSystemRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSystemRuleResponse self = new DeleteSystemRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSystemRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSystemRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSystemRuleResponse setBody(DeleteSystemRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSystemRuleResponseBody getBody() {
        return this.body;
    }

}
