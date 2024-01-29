// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregateConfigRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAggregateConfigRulesResponseBody body;

    public static DeleteAggregateConfigRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregateConfigRulesResponse self = new DeleteAggregateConfigRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAggregateConfigRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAggregateConfigRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAggregateConfigRulesResponse setBody(DeleteAggregateConfigRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAggregateConfigRulesResponseBody getBody() {
        return this.body;
    }

}
