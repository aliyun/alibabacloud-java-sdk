// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateGrafanaWorkspaceVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGrafanaWorkspaceVersionResponseBody body;

    public static UpdateGrafanaWorkspaceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGrafanaWorkspaceVersionResponse self = new UpdateGrafanaWorkspaceVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGrafanaWorkspaceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGrafanaWorkspaceVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGrafanaWorkspaceVersionResponse setBody(UpdateGrafanaWorkspaceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGrafanaWorkspaceVersionResponseBody getBody() {
        return this.body;
    }

}
