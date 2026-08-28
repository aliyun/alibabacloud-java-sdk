// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListExternalAgentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExternalAgentsResponseBody body;

    public static ListExternalAgentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExternalAgentsResponse self = new ListExternalAgentsResponse();
        return TeaModel.build(map, self);
    }

    public ListExternalAgentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExternalAgentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExternalAgentsResponse setBody(ListExternalAgentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExternalAgentsResponseBody getBody() {
        return this.body;
    }

}
