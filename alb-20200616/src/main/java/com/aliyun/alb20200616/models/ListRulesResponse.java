// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRulesResponseBody body;

    public static ListRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRulesResponse self = new ListRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRulesResponse setBody(ListRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRulesResponseBody getBody() {
        return this.body;
    }

}
