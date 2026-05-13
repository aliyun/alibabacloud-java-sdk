// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class WorkspaceCodePublishResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WorkspaceCodePublishResponseBody body;

    public static WorkspaceCodePublishResponse build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceCodePublishResponse self = new WorkspaceCodePublishResponse();
        return TeaModel.build(map, self);
    }

    public WorkspaceCodePublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WorkspaceCodePublishResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WorkspaceCodePublishResponse setBody(WorkspaceCodePublishResponseBody body) {
        this.body = body;
        return this;
    }
    public WorkspaceCodePublishResponseBody getBody() {
        return this.body;
    }

}
