// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateOriginRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOriginRuleResponseBody body;

    public static CreateOriginRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOriginRuleResponse self = new CreateOriginRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateOriginRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOriginRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOriginRuleResponse setBody(CreateOriginRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOriginRuleResponseBody getBody() {
        return this.body;
    }

}
