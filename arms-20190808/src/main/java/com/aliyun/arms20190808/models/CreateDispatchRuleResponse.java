// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateDispatchRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDispatchRuleResponseBody body;

    public static CreateDispatchRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDispatchRuleResponse self = new CreateDispatchRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateDispatchRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDispatchRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDispatchRuleResponse setBody(CreateDispatchRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDispatchRuleResponseBody getBody() {
        return this.body;
    }

}
