// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class UpdateClientRuleStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateClientRuleStrategyResponseBody body;

    public static UpdateClientRuleStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClientRuleStrategyResponse self = new UpdateClientRuleStrategyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClientRuleStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClientRuleStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateClientRuleStrategyResponse setBody(UpdateClientRuleStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClientRuleStrategyResponseBody getBody() {
        return this.body;
    }

}
