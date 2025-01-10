// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVpdGrantRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVpdGrantRuleResponseBody body;

    public static GetVpdGrantRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVpdGrantRuleResponse self = new GetVpdGrantRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetVpdGrantRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVpdGrantRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVpdGrantRuleResponse setBody(GetVpdGrantRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVpdGrantRuleResponseBody getBody() {
        return this.body;
    }

}
