// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListWorkspaceUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkspaceUsersResponseBody body;

    public static ListWorkspaceUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceUsersResponse self = new ListWorkspaceUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkspaceUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkspaceUsersResponse setBody(ListWorkspaceUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkspaceUsersResponseBody getBody() {
        return this.body;
    }

}
