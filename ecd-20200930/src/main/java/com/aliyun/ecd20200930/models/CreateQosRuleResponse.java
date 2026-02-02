// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateQosRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateQosRuleResponseBody body;

    public static CreateQosRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQosRuleResponse self = new CreateQosRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateQosRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQosRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateQosRuleResponse setBody(CreateQosRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQosRuleResponseBody getBody() {
        return this.body;
    }

}
