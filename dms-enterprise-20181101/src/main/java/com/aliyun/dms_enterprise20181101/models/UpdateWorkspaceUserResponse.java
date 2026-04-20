// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkspaceUserResponseBody body;

    public static UpdateWorkspaceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceUserResponse self = new UpdateWorkspaceUserResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkspaceUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkspaceUserResponse setBody(UpdateWorkspaceUserResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkspaceUserResponseBody getBody() {
        return this.body;
    }

}
