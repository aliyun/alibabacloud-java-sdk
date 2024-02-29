// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListIsolationRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIsolationRulesResponseBody body;

    public static ListIsolationRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIsolationRulesResponse self = new ListIsolationRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListIsolationRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIsolationRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIsolationRulesResponse setBody(ListIsolationRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIsolationRulesResponseBody getBody() {
        return this.body;
    }

}
