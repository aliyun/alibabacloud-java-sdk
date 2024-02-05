// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkspaceMembersResponseBody body;

    public static DeleteWorkspaceMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceMembersResponse self = new DeleteWorkspaceMembersResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkspaceMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkspaceMembersResponse setBody(DeleteWorkspaceMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkspaceMembersResponseBody getBody() {
        return this.body;
    }

}
