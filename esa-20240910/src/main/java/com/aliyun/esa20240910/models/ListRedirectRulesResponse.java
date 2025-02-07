// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRedirectRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRedirectRulesResponseBody body;

    public static ListRedirectRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRedirectRulesResponse self = new ListRedirectRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListRedirectRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRedirectRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRedirectRulesResponse setBody(ListRedirectRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRedirectRulesResponseBody getBody() {
        return this.body;
    }

}
