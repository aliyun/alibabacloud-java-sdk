// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetLastWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLastWorkspaceResponseBody body;

    public static GetLastWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLastWorkspaceResponse self = new GetLastWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public GetLastWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLastWorkspaceResponse setBody(GetLastWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLastWorkspaceResponseBody getBody() {
        return this.body;
    }

}
