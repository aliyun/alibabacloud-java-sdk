// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceDocMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkspaceDocMembersResponseBody body;

    public static DeleteWorkspaceDocMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceDocMembersResponse self = new DeleteWorkspaceDocMembersResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceDocMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkspaceDocMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkspaceDocMembersResponse setBody(DeleteWorkspaceDocMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkspaceDocMembersResponseBody getBody() {
        return this.body;
    }

}
