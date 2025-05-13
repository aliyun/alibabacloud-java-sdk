// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PutWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutWorkspaceResponseBody body;

    public static PutWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        PutWorkspaceResponse self = new PutWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public PutWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutWorkspaceResponse setBody(PutWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public PutWorkspaceResponseBody getBody() {
        return this.body;
    }

}
