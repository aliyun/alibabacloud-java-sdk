// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateNetworkRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNetworkRuleResponseBody body;

    public static CreateNetworkRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkRuleResponse self = new CreateNetworkRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNetworkRuleResponse setBody(CreateNetworkRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkRuleResponseBody getBody() {
        return this.body;
    }

}
