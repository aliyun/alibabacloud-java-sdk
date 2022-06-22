// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class WorkspaceCloneExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public WorkspaceCloneExperimentResponseBody body;

    public static WorkspaceCloneExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceCloneExperimentResponse self = new WorkspaceCloneExperimentResponse();
        return TeaModel.build(map, self);
    }

    public WorkspaceCloneExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WorkspaceCloneExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WorkspaceCloneExperimentResponse setBody(WorkspaceCloneExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public WorkspaceCloneExperimentResponseBody getBody() {
        return this.body;
    }

}
