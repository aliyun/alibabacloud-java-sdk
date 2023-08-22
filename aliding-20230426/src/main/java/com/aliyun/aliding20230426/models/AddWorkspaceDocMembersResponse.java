// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddWorkspaceDocMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddWorkspaceDocMembersResponseBody body;

    public static AddWorkspaceDocMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceDocMembersResponse self = new AddWorkspaceDocMembersResponse();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceDocMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddWorkspaceDocMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddWorkspaceDocMembersResponse setBody(AddWorkspaceDocMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddWorkspaceDocMembersResponseBody getBody() {
        return this.body;
    }

}
