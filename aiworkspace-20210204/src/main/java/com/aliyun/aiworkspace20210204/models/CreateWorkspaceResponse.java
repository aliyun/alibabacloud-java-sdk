// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateWorkspaceResponseBody body;

    public static CreateWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceResponse self = new CreateWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkspaceResponse setBody(CreateWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkspaceResponseBody getBody() {
        return this.body;
    }

}
