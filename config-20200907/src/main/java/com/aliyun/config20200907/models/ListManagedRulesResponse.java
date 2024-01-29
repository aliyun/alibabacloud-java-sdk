// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListManagedRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListManagedRulesResponseBody body;

    public static ListManagedRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListManagedRulesResponse self = new ListManagedRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListManagedRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListManagedRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListManagedRulesResponse setBody(ListManagedRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListManagedRulesResponseBody getBody() {
        return this.body;
    }

}
