// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCustomResponseCodeRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomResponseCodeRuleResponseBody body;

    public static UpdateCustomResponseCodeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomResponseCodeRuleResponse self = new UpdateCustomResponseCodeRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomResponseCodeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomResponseCodeRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomResponseCodeRuleResponse setBody(UpdateCustomResponseCodeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomResponseCodeRuleResponseBody getBody() {
        return this.body;
    }

}
