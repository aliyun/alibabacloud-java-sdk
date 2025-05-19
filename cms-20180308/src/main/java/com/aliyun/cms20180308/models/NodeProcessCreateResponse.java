// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class NodeProcessCreateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public NodeProcessCreateResponseBody body;

    public static NodeProcessCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        NodeProcessCreateResponse self = new NodeProcessCreateResponse();
        return TeaModel.build(map, self);
    }

    public NodeProcessCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NodeProcessCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NodeProcessCreateResponse setBody(NodeProcessCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public NodeProcessCreateResponseBody getBody() {
        return this.body;
    }

}
