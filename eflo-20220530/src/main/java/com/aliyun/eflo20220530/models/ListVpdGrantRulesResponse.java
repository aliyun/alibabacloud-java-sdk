// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVpdGrantRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListVpdGrantRulesResponseBody body;

    public static ListVpdGrantRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpdGrantRulesResponse self = new ListVpdGrantRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListVpdGrantRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpdGrantRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVpdGrantRulesResponse setBody(ListVpdGrantRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpdGrantRulesResponseBody getBody() {
        return this.body;
    }

}
