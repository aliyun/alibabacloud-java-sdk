// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRedirectRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRedirectRuleResponseBody body;

    public static CreateRedirectRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRedirectRuleResponse self = new CreateRedirectRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateRedirectRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRedirectRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRedirectRuleResponse setBody(CreateRedirectRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRedirectRuleResponseBody getBody() {
        return this.body;
    }

}
