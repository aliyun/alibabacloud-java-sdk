// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListWorkersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkersResponseBody body;

    public static ListWorkersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkersResponse self = new ListWorkersResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkersResponse setBody(ListWorkersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkersResponseBody getBody() {
        return this.body;
    }

}
