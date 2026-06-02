// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetWorkspaceCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkspaceCodeResponseBody body;

    public static GetWorkspaceCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceCodeResponse self = new GetWorkspaceCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkspaceCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkspaceCodeResponse setBody(GetWorkspaceCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkspaceCodeResponseBody getBody() {
        return this.body;
    }

}
