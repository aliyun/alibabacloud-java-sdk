// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMineWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMineWorkspaceResponseBody body;

    public static GetMineWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMineWorkspaceResponse self = new GetMineWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public GetMineWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMineWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMineWorkspaceResponse setBody(GetMineWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMineWorkspaceResponseBody getBody() {
        return this.body;
    }

}
