// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkspaceResponseBody body;

    public static GetWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceResponse self = new GetWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkspaceResponse setBody(GetWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkspaceResponseBody getBody() {
        return this.body;
    }

}
