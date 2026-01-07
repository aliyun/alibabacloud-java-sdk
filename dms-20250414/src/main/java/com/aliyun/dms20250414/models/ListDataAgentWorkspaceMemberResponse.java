// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentWorkspaceMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataAgentWorkspaceMemberResponseBody body;

    public static ListDataAgentWorkspaceMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentWorkspaceMemberResponse self = new ListDataAgentWorkspaceMemberResponse();
        return TeaModel.build(map, self);
    }

    public ListDataAgentWorkspaceMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataAgentWorkspaceMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataAgentWorkspaceMemberResponse setBody(ListDataAgentWorkspaceMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataAgentWorkspaceMemberResponseBody getBody() {
        return this.body;
    }

}
