// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RemoveNodePoolNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveNodePoolNodesResponseBody body;

    public static RemoveNodePoolNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveNodePoolNodesResponse self = new RemoveNodePoolNodesResponse();
        return TeaModel.build(map, self);
    }

    public RemoveNodePoolNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveNodePoolNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveNodePoolNodesResponse setBody(RemoveNodePoolNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveNodePoolNodesResponseBody getBody() {
        return this.body;
    }

}
