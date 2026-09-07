// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListGrafanaWorkspaceAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGrafanaWorkspaceAccountResponseBody body;

    public static ListGrafanaWorkspaceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGrafanaWorkspaceAccountResponse self = new ListGrafanaWorkspaceAccountResponse();
        return TeaModel.build(map, self);
    }

    public ListGrafanaWorkspaceAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGrafanaWorkspaceAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGrafanaWorkspaceAccountResponse setBody(ListGrafanaWorkspaceAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGrafanaWorkspaceAccountResponseBody getBody() {
        return this.body;
    }

}
