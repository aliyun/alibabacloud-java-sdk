// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListMcpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMcpsResponseBody body;

    public static ListMcpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcpsResponse self = new ListMcpsResponse();
        return TeaModel.build(map, self);
    }

    public ListMcpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMcpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMcpsResponse setBody(ListMcpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcpsResponseBody getBody() {
        return this.body;
    }

}
