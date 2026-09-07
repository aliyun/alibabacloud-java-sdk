// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceHttpApiProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrafanaWorkspaceHttpApiProxyResponseBody body;

    public static GrafanaWorkspaceHttpApiProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceHttpApiProxyResponse self = new GrafanaWorkspaceHttpApiProxyResponse();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceHttpApiProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrafanaWorkspaceHttpApiProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrafanaWorkspaceHttpApiProxyResponse setBody(GrafanaWorkspaceHttpApiProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public GrafanaWorkspaceHttpApiProxyResponseBody getBody() {
        return this.body;
    }

}
