// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListAgentSessionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentSessionsResponseBody body;

    public static ListAgentSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSessionsResponse self = new ListAgentSessionsResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentSessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentSessionsResponse setBody(ListAgentSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentSessionsResponseBody getBody() {
        return this.body;
    }

}
