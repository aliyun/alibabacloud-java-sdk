// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListAppModulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppModulesResponseBody body;

    public static ListAppModulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppModulesResponse self = new ListAppModulesResponse();
        return TeaModel.build(map, self);
    }

    public ListAppModulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppModulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppModulesResponse setBody(ListAppModulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppModulesResponseBody getBody() {
        return this.body;
    }

}
