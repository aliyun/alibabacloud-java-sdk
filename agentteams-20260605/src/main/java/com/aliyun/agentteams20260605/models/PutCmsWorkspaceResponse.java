// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class PutCmsWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutCmsWorkspaceResponseBody body;

    public static PutCmsWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        PutCmsWorkspaceResponse self = new PutCmsWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public PutCmsWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutCmsWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutCmsWorkspaceResponse setBody(PutCmsWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public PutCmsWorkspaceResponseBody getBody() {
        return this.body;
    }

}
