// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListModelConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelConnectionsResponseBody body;

    public static ListModelConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelConnectionsResponse self = new ListModelConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListModelConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelConnectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelConnectionsResponse setBody(ListModelConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelConnectionsResponseBody getBody() {
        return this.body;
    }

}
