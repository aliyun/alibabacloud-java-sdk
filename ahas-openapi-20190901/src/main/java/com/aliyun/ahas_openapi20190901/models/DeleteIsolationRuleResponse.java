// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DeleteIsolationRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIsolationRuleResponseBody body;

    public static DeleteIsolationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIsolationRuleResponse self = new DeleteIsolationRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIsolationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIsolationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIsolationRuleResponse setBody(DeleteIsolationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIsolationRuleResponseBody getBody() {
        return this.body;
    }

}
