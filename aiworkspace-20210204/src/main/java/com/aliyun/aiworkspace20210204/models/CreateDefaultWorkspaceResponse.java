// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDefaultWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDefaultWorkspaceResponseBody body;

    public static CreateDefaultWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDefaultWorkspaceResponse self = new CreateDefaultWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDefaultWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDefaultWorkspaceResponse setBody(CreateDefaultWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDefaultWorkspaceResponseBody getBody() {
        return this.body;
    }

}
