// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateGrafanaWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGrafanaWorkspaceResponseBody body;

    public static UpdateGrafanaWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGrafanaWorkspaceResponse self = new UpdateGrafanaWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGrafanaWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGrafanaWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGrafanaWorkspaceResponse setBody(UpdateGrafanaWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGrafanaWorkspaceResponseBody getBody() {
        return this.body;
    }

}
