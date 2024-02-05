// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetWorkspacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkspacesResponseBody body;

    public static GetWorkspacesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspacesResponse self = new GetWorkspacesResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkspacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkspacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkspacesResponse setBody(GetWorkspacesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkspacesResponseBody getBody() {
        return this.body;
    }

}
