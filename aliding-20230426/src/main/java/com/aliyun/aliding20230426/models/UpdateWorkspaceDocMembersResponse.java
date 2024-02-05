// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceDocMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkspaceDocMembersResponseBody body;

    public static UpdateWorkspaceDocMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceDocMembersResponse self = new UpdateWorkspaceDocMembersResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceDocMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkspaceDocMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkspaceDocMembersResponse setBody(UpdateWorkspaceDocMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkspaceDocMembersResponseBody getBody() {
        return this.body;
    }

}
