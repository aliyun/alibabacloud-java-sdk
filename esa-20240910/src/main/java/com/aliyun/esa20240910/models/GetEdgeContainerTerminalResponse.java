// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerTerminalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEdgeContainerTerminalResponseBody body;

    public static GetEdgeContainerTerminalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerTerminalResponse self = new GetEdgeContainerTerminalResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerTerminalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeContainerTerminalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEdgeContainerTerminalResponse setBody(GetEdgeContainerTerminalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeContainerTerminalResponseBody getBody() {
        return this.body;
    }

}
