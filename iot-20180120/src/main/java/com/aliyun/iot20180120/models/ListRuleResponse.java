// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRuleResponseBody body;

    public static ListRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRuleResponse self = new ListRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRuleResponse setBody(ListRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRuleResponseBody getBody() {
        return this.body;
    }

}
