// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetWorkspaceAcrRamAuthorizeUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkspaceAcrRamAuthorizeUrlResponseBody body;

    public static GetWorkspaceAcrRamAuthorizeUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceAcrRamAuthorizeUrlResponse self = new GetWorkspaceAcrRamAuthorizeUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceAcrRamAuthorizeUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkspaceAcrRamAuthorizeUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkspaceAcrRamAuthorizeUrlResponse setBody(GetWorkspaceAcrRamAuthorizeUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkspaceAcrRamAuthorizeUrlResponseBody getBody() {
        return this.body;
    }

}
