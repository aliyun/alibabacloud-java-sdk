// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWorkspaceResponseBody body;

    public static DeleteWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceResponse self = new DeleteWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkspaceResponse setBody(DeleteWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkspaceResponseBody getBody() {
        return this.body;
    }

}
