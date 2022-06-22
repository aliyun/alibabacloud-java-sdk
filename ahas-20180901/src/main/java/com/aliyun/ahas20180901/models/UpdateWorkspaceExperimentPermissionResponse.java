// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceExperimentPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateWorkspaceExperimentPermissionResponseBody body;

    public static UpdateWorkspaceExperimentPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceExperimentPermissionResponse self = new UpdateWorkspaceExperimentPermissionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceExperimentPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkspaceExperimentPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkspaceExperimentPermissionResponse setBody(UpdateWorkspaceExperimentPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkspaceExperimentPermissionResponseBody getBody() {
        return this.body;
    }

}
