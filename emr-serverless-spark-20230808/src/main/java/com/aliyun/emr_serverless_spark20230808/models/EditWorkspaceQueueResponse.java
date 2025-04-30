// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class EditWorkspaceQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EditWorkspaceQueueResponseBody body;

    public static EditWorkspaceQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        EditWorkspaceQueueResponse self = new EditWorkspaceQueueResponse();
        return TeaModel.build(map, self);
    }

    public EditWorkspaceQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditWorkspaceQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditWorkspaceQueueResponse setBody(EditWorkspaceQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public EditWorkspaceQueueResponseBody getBody() {
        return this.body;
    }

}
