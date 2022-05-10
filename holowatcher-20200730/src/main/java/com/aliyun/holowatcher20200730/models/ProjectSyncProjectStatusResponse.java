// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectSyncProjectStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ProjectSyncProjectStatusResponseBody body;

    public static ProjectSyncProjectStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ProjectSyncProjectStatusResponse self = new ProjectSyncProjectStatusResponse();
        return TeaModel.build(map, self);
    }

    public ProjectSyncProjectStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProjectSyncProjectStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProjectSyncProjectStatusResponse setBody(ProjectSyncProjectStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ProjectSyncProjectStatusResponseBody getBody() {
        return this.body;
    }

}
