// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class DeleteClientRuleStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteClientRuleStrategyResponseBody body;

    public static DeleteClientRuleStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientRuleStrategyResponse self = new DeleteClientRuleStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClientRuleStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClientRuleStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteClientRuleStrategyResponse setBody(DeleteClientRuleStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClientRuleStrategyResponseBody getBody() {
        return this.body;
    }

}
