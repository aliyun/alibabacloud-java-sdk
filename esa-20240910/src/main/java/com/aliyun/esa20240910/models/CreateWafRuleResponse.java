// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateWafRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWafRuleResponseBody body;

    public static CreateWafRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWafRuleResponse self = new CreateWafRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateWafRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWafRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWafRuleResponse setBody(CreateWafRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWafRuleResponseBody getBody() {
        return this.body;
    }

}
