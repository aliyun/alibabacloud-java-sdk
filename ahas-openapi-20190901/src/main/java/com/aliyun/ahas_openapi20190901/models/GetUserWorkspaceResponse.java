// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetUserWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserWorkspaceResponseBody body;

    public static GetUserWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserWorkspaceResponse self = new GetUserWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public GetUserWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserWorkspaceResponse setBody(GetUserWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserWorkspaceResponseBody getBody() {
        return this.body;
    }

}
