// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class WorkspaceActionLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WorkspaceActionLogResponseBody body;

    public static WorkspaceActionLogResponse build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceActionLogResponse self = new WorkspaceActionLogResponse();
        return TeaModel.build(map, self);
    }

    public WorkspaceActionLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WorkspaceActionLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WorkspaceActionLogResponse setBody(WorkspaceActionLogResponseBody body) {
        this.body = body;
        return this;
    }
    public WorkspaceActionLogResponseBody getBody() {
        return this.body;
    }

}
