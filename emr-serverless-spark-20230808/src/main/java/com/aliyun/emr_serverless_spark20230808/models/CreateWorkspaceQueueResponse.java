// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateWorkspaceQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWorkspaceQueueResponseBody body;

    public static CreateWorkspaceQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceQueueResponse self = new CreateWorkspaceQueueResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkspaceQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkspaceQueueResponse setBody(CreateWorkspaceQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkspaceQueueResponseBody getBody() {
        return this.body;
    }

}
