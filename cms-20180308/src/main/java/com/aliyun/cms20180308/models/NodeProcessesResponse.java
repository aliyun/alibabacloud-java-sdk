// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class NodeProcessesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public NodeProcessesResponseBody body;

    public static NodeProcessesResponse build(java.util.Map<String, ?> map) throws Exception {
        NodeProcessesResponse self = new NodeProcessesResponse();
        return TeaModel.build(map, self);
    }

    public NodeProcessesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NodeProcessesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NodeProcessesResponse setBody(NodeProcessesResponseBody body) {
        this.body = body;
        return this;
    }
    public NodeProcessesResponseBody getBody() {
        return this.body;
    }

}
