// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListUserPoolClientsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserPoolClientsResponseBody body;

    public static ListUserPoolClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserPoolClientsResponse self = new ListUserPoolClientsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserPoolClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserPoolClientsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserPoolClientsResponse setBody(ListUserPoolClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserPoolClientsResponseBody getBody() {
        return this.body;
    }

}
