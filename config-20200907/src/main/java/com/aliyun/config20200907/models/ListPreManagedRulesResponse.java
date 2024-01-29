// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListPreManagedRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPreManagedRulesResponseBody body;

    public static ListPreManagedRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPreManagedRulesResponse self = new ListPreManagedRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListPreManagedRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPreManagedRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPreManagedRulesResponse setBody(ListPreManagedRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPreManagedRulesResponseBody getBody() {
        return this.body;
    }

}
