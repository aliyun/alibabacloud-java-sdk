// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateDNSServiceRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDNSServiceRuleResponseBody body;

    public static CreateDNSServiceRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDNSServiceRuleResponse self = new CreateDNSServiceRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateDNSServiceRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDNSServiceRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDNSServiceRuleResponse setBody(CreateDNSServiceRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDNSServiceRuleResponseBody getBody() {
        return this.body;
    }

}
