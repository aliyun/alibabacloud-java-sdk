// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataAgentWorkspaceResponseBody body;

    public static ListDataAgentWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentWorkspaceResponse self = new ListDataAgentWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public ListDataAgentWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataAgentWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataAgentWorkspaceResponse setBody(ListDataAgentWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataAgentWorkspaceResponseBody getBody() {
        return this.body;
    }

}
