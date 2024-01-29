// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAggregateConfigRulesResponseBody body;

    public static ListAggregateConfigRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateConfigRulesResponse self = new ListAggregateConfigRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListAggregateConfigRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAggregateConfigRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAggregateConfigRulesResponse setBody(ListAggregateConfigRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAggregateConfigRulesResponseBody getBody() {
        return this.body;
    }

}
