// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class WorkspaceActionStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WorkspaceActionStatusResponseBody body;

    public static WorkspaceActionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceActionStatusResponse self = new WorkspaceActionStatusResponse();
        return TeaModel.build(map, self);
    }

    public WorkspaceActionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WorkspaceActionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WorkspaceActionStatusResponse setBody(WorkspaceActionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public WorkspaceActionStatusResponseBody getBody() {
        return this.body;
    }

}
