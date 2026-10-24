// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class ListClientRuleStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClientRuleStrategyResponseBody body;

    public static ListClientRuleStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClientRuleStrategyResponse self = new ListClientRuleStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ListClientRuleStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClientRuleStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClientRuleStrategyResponse setBody(ListClientRuleStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClientRuleStrategyResponseBody getBody() {
        return this.body;
    }

}
