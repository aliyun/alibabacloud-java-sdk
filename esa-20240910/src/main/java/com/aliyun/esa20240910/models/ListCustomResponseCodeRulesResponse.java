// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCustomResponseCodeRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomResponseCodeRulesResponseBody body;

    public static ListCustomResponseCodeRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomResponseCodeRulesResponse self = new ListCustomResponseCodeRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomResponseCodeRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomResponseCodeRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomResponseCodeRulesResponse setBody(ListCustomResponseCodeRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomResponseCodeRulesResponseBody getBody() {
        return this.body;
    }

}
