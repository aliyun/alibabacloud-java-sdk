// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListDispatchRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDispatchRuleResponseBody body;

    public static ListDispatchRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDispatchRuleResponse self = new ListDispatchRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListDispatchRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDispatchRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDispatchRuleResponse setBody(ListDispatchRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDispatchRuleResponseBody getBody() {
        return this.body;
    }

}
