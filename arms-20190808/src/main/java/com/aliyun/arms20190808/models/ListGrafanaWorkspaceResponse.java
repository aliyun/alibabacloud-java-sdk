// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListGrafanaWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListGrafanaWorkspaceResponseBody body;

    public static ListGrafanaWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGrafanaWorkspaceResponse self = new ListGrafanaWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public ListGrafanaWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGrafanaWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGrafanaWorkspaceResponse setBody(ListGrafanaWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGrafanaWorkspaceResponseBody getBody() {
        return this.body;
    }

}
