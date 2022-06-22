// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWorkspaceExperimentResponseBody body;

    public static DeleteWorkspaceExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceExperimentResponse self = new DeleteWorkspaceExperimentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkspaceExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkspaceExperimentResponse setBody(DeleteWorkspaceExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkspaceExperimentResponseBody getBody() {
        return this.body;
    }

}
