// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkspaceResponseBody body;

    public static UpdateWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceResponse self = new UpdateWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkspaceResponse setBody(UpdateWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkspaceResponseBody getBody() {
        return this.body;
    }

}
