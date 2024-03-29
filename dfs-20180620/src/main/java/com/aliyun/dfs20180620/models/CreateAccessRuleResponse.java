// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateAccessRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAccessRuleResponseBody body;

    public static CreateAccessRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessRuleResponse self = new CreateAccessRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccessRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAccessRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAccessRuleResponse setBody(CreateAccessRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccessRuleResponseBody getBody() {
        return this.body;
    }

}
