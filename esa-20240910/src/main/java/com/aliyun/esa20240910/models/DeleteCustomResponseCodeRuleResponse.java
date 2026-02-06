// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteCustomResponseCodeRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomResponseCodeRuleResponseBody body;

    public static DeleteCustomResponseCodeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomResponseCodeRuleResponse self = new DeleteCustomResponseCodeRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomResponseCodeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomResponseCodeRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomResponseCodeRuleResponse setBody(DeleteCustomResponseCodeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomResponseCodeRuleResponseBody getBody() {
        return this.body;
    }

}
