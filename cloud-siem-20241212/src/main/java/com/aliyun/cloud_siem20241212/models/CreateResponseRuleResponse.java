// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateResponseRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateResponseRuleResponseBody body;

    public static CreateResponseRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResponseRuleResponse self = new CreateResponseRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateResponseRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResponseRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateResponseRuleResponse setBody(CreateResponseRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResponseRuleResponseBody getBody() {
        return this.body;
    }

}
