// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class NodeUninstallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public NodeUninstallResponseBody body;

    public static NodeUninstallResponse build(java.util.Map<String, ?> map) throws Exception {
        NodeUninstallResponse self = new NodeUninstallResponse();
        return TeaModel.build(map, self);
    }

    public NodeUninstallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NodeUninstallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NodeUninstallResponse setBody(NodeUninstallResponseBody body) {
        this.body = body;
        return this;
    }
    public NodeUninstallResponseBody getBody() {
        return this.body;
    }

}
