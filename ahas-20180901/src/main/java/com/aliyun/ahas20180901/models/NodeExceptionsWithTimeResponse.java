// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class NodeExceptionsWithTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public NodeExceptionsWithTimeResponseBody body;

    public static NodeExceptionsWithTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        NodeExceptionsWithTimeResponse self = new NodeExceptionsWithTimeResponse();
        return TeaModel.build(map, self);
    }

    public NodeExceptionsWithTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NodeExceptionsWithTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NodeExceptionsWithTimeResponse setBody(NodeExceptionsWithTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public NodeExceptionsWithTimeResponseBody getBody() {
        return this.body;
    }

}
