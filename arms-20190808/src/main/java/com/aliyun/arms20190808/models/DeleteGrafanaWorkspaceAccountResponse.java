// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteGrafanaWorkspaceAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGrafanaWorkspaceAccountResponseBody body;

    public static DeleteGrafanaWorkspaceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGrafanaWorkspaceAccountResponse self = new DeleteGrafanaWorkspaceAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGrafanaWorkspaceAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGrafanaWorkspaceAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGrafanaWorkspaceAccountResponse setBody(DeleteGrafanaWorkspaceAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGrafanaWorkspaceAccountResponseBody getBody() {
        return this.body;
    }

}
