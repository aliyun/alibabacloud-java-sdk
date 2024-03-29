// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListAccessRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAccessRulesResponseBody body;

    public static ListAccessRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccessRulesResponse self = new ListAccessRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListAccessRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccessRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccessRulesResponse setBody(ListAccessRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccessRulesResponseBody getBody() {
        return this.body;
    }

}
