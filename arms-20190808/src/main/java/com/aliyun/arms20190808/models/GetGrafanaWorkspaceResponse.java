// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetGrafanaWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGrafanaWorkspaceResponseBody body;

    public static GetGrafanaWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGrafanaWorkspaceResponse self = new GetGrafanaWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public GetGrafanaWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGrafanaWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGrafanaWorkspaceResponse setBody(GetGrafanaWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGrafanaWorkspaceResponseBody getBody() {
        return this.body;
    }

}
