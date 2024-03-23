// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateDefaultWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDefaultWorkspaceResponseBody body;

    public static UpdateDefaultWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDefaultWorkspaceResponse self = new UpdateDefaultWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDefaultWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDefaultWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDefaultWorkspaceResponse setBody(UpdateDefaultWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDefaultWorkspaceResponseBody getBody() {
        return this.body;
    }

}
