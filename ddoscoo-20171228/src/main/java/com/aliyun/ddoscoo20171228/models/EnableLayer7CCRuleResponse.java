// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class EnableLayer7CCRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableLayer7CCRuleResponseBody body;

    public static EnableLayer7CCRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableLayer7CCRuleResponse self = new EnableLayer7CCRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableLayer7CCRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableLayer7CCRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableLayer7CCRuleResponse setBody(EnableLayer7CCRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableLayer7CCRuleResponseBody getBody() {
        return this.body;
    }

}
