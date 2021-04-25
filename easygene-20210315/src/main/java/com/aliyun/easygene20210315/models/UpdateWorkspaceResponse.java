// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateWorkspaceResponse setBody(UpdateWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkspaceResponseBody getBody() {
        return this.body;
    }

}
