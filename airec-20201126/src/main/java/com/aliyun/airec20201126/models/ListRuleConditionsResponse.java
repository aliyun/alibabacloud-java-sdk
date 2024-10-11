// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListRuleConditionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRuleConditionsResponseBody body;

    public static ListRuleConditionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRuleConditionsResponse self = new ListRuleConditionsResponse();
        return TeaModel.build(map, self);
    }

    public ListRuleConditionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRuleConditionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRuleConditionsResponse setBody(ListRuleConditionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRuleConditionsResponseBody getBody() {
        return this.body;
    }

}
