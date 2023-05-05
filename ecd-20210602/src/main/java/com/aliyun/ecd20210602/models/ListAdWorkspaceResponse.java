// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListAdWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAdWorkspaceResponseBody body;

    public static ListAdWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAdWorkspaceResponse self = new ListAdWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public ListAdWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAdWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAdWorkspaceResponse setBody(ListAdWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAdWorkspaceResponseBody getBody() {
        return this.body;
    }

}
