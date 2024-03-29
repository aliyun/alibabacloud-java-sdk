// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddWorkspaceMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddWorkspaceMembersResponseBody body;

    public static AddWorkspaceMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceMembersResponse self = new AddWorkspaceMembersResponse();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddWorkspaceMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddWorkspaceMembersResponse setBody(AddWorkspaceMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddWorkspaceMembersResponseBody getBody() {
        return this.body;
    }

}
