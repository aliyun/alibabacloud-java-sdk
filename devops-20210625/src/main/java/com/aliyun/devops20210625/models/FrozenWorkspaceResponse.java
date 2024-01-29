// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class FrozenWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FrozenWorkspaceResponseBody body;

    public static FrozenWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        FrozenWorkspaceResponse self = new FrozenWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public FrozenWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FrozenWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FrozenWorkspaceResponse setBody(FrozenWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public FrozenWorkspaceResponseBody getBody() {
        return this.body;
    }

}
