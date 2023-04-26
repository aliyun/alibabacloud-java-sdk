// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVccGrantRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetVccGrantRuleResponseBody body;

    public static GetVccGrantRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVccGrantRuleResponse self = new GetVccGrantRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetVccGrantRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVccGrantRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVccGrantRuleResponse setBody(GetVccGrantRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVccGrantRuleResponseBody getBody() {
        return this.body;
    }

}
