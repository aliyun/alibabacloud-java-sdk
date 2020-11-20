// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClusterNodesResponseBody body;

    public static DeleteClusterNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterNodesResponse self = new DeleteClusterNodesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClusterNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClusterNodesResponse setBody(DeleteClusterNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClusterNodesResponseBody getBody() {
        return this.body;
    }

}
