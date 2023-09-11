// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateNetworkRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateNetworkRuleResponseBody body;

    public static UpdateNetworkRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkRuleResponse self = new UpdateNetworkRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNetworkRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNetworkRuleResponse setBody(UpdateNetworkRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNetworkRuleResponseBody getBody() {
        return this.body;
    }

}
