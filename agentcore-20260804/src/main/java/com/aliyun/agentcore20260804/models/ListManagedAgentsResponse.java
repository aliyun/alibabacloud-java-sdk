// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListManagedAgentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListManagedAgentsResponseBody body;

    public static ListManagedAgentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListManagedAgentsResponse self = new ListManagedAgentsResponse();
        return TeaModel.build(map, self);
    }

    public ListManagedAgentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListManagedAgentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListManagedAgentsResponse setBody(ListManagedAgentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListManagedAgentsResponseBody getBody() {
        return this.body;
    }

}
