// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ReleaseWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseWorkspaceResponseBody body;

    public static ReleaseWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseWorkspaceResponse self = new ReleaseWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseWorkspaceResponse setBody(ReleaseWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseWorkspaceResponseBody getBody() {
        return this.body;
    }

}
