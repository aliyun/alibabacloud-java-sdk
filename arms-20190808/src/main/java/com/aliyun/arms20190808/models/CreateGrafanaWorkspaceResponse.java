// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateGrafanaWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGrafanaWorkspaceResponseBody body;

    public static CreateGrafanaWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGrafanaWorkspaceResponse self = new CreateGrafanaWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateGrafanaWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGrafanaWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGrafanaWorkspaceResponse setBody(CreateGrafanaWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGrafanaWorkspaceResponseBody getBody() {
        return this.body;
    }

}
