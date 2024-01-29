// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkspaceResponseBody body;

    public static DeleteWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceResponse self = new DeleteWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkspaceResponse setBody(DeleteWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkspaceResponseBody getBody() {
        return this.body;
    }

}
