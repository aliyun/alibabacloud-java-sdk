// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetWorkspacePluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkspacePluginResponseBody body;

    public static GetWorkspacePluginResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspacePluginResponse self = new GetWorkspacePluginResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkspacePluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkspacePluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkspacePluginResponse setBody(GetWorkspacePluginResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkspacePluginResponseBody getBody() {
        return this.body;
    }

}
