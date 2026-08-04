// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentMcpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataAgentMcpResponseBody body;

    public static ListDataAgentMcpResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentMcpResponse self = new ListDataAgentMcpResponse();
        return TeaModel.build(map, self);
    }

    public ListDataAgentMcpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataAgentMcpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataAgentMcpResponse setBody(ListDataAgentMcpResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataAgentMcpResponseBody getBody() {
        return this.body;
    }

}
