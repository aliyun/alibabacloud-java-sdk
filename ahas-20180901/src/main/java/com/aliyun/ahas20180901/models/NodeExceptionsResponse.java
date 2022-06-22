// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class NodeExceptionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public NodeExceptionsResponseBody body;

    public static NodeExceptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        NodeExceptionsResponse self = new NodeExceptionsResponse();
        return TeaModel.build(map, self);
    }

    public NodeExceptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NodeExceptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NodeExceptionsResponse setBody(NodeExceptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public NodeExceptionsResponseBody getBody() {
        return this.body;
    }

}
