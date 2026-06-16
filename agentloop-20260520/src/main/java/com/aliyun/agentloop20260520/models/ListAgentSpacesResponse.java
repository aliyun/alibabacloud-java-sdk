// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListAgentSpacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentSpacesResponseBody body;

    public static ListAgentSpacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSpacesResponse self = new ListAgentSpacesResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentSpacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentSpacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentSpacesResponse setBody(ListAgentSpacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentSpacesResponseBody getBody() {
        return this.body;
    }

}
