// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteGrafanaWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGrafanaWorkspaceResponseBody body;

    public static DeleteGrafanaWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGrafanaWorkspaceResponse self = new DeleteGrafanaWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGrafanaWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGrafanaWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGrafanaWorkspaceResponse setBody(DeleteGrafanaWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGrafanaWorkspaceResponseBody getBody() {
        return this.body;
    }

}
