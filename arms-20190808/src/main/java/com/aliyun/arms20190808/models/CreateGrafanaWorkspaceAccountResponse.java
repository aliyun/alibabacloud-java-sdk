// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateGrafanaWorkspaceAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGrafanaWorkspaceAccountResponseBody body;

    public static CreateGrafanaWorkspaceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGrafanaWorkspaceAccountResponse self = new CreateGrafanaWorkspaceAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateGrafanaWorkspaceAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGrafanaWorkspaceAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGrafanaWorkspaceAccountResponse setBody(CreateGrafanaWorkspaceAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGrafanaWorkspaceAccountResponseBody getBody() {
        return this.body;
    }

}
