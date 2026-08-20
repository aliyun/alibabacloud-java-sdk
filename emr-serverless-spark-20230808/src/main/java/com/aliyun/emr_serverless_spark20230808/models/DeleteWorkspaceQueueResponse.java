// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkspaceQueueResponseBody body;

    public static DeleteWorkspaceQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceQueueResponse self = new DeleteWorkspaceQueueResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkspaceQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkspaceQueueResponse setBody(DeleteWorkspaceQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkspaceQueueResponseBody getBody() {
        return this.body;
    }

}
