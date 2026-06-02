// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkspaceCodeResponseBody body;

    public static DeleteWorkspaceCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceCodeResponse self = new DeleteWorkspaceCodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkspaceCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkspaceCodeResponse setBody(DeleteWorkspaceCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkspaceCodeResponseBody getBody() {
        return this.body;
    }

}
