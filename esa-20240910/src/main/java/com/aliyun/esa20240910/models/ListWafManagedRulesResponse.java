// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafManagedRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWafManagedRulesResponseBody body;

    public static ListWafManagedRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWafManagedRulesResponse self = new ListWafManagedRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListWafManagedRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWafManagedRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWafManagedRulesResponse setBody(ListWafManagedRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWafManagedRulesResponseBody getBody() {
        return this.body;
    }

}
