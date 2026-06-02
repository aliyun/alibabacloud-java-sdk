// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListWorkspaceCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkspaceCodeResponseBody body;

    public static ListWorkspaceCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceCodeResponse self = new ListWorkspaceCodeResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkspaceCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkspaceCodeResponse setBody(ListWorkspaceCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkspaceCodeResponseBody getBody() {
        return this.body;
    }

}
