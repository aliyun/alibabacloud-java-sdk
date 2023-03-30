// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVccGrantRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListVccGrantRulesResponseBody body;

    public static ListVccGrantRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVccGrantRulesResponse self = new ListVccGrantRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListVccGrantRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVccGrantRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVccGrantRulesResponse setBody(ListVccGrantRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVccGrantRulesResponseBody getBody() {
        return this.body;
    }

}
