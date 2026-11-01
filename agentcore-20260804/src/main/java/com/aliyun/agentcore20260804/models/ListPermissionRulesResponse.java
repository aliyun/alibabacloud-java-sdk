// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListPermissionRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPermissionRulesResponseBody body;

    public static ListPermissionRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionRulesResponse self = new ListPermissionRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListPermissionRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPermissionRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPermissionRulesResponse setBody(ListPermissionRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPermissionRulesResponseBody getBody() {
        return this.body;
    }

}
