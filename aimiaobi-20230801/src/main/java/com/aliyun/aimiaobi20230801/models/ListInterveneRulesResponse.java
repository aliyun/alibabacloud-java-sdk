// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListInterveneRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInterveneRulesResponseBody body;

    public static ListInterveneRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInterveneRulesResponse self = new ListInterveneRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListInterveneRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInterveneRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInterveneRulesResponse setBody(ListInterveneRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInterveneRulesResponseBody getBody() {
        return this.body;
    }

}
