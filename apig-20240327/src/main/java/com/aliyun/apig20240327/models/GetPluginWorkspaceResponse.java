// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetPluginWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPluginWorkspaceResponseBody body;

    public static GetPluginWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPluginWorkspaceResponse self = new GetPluginWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public GetPluginWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPluginWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPluginWorkspaceResponse setBody(GetPluginWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPluginWorkspaceResponseBody getBody() {
        return this.body;
    }

}
