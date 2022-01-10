// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDefaultWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDefaultWorkspaceResponseBody body;

    public static GetDefaultWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultWorkspaceResponse self = new GetDefaultWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public GetDefaultWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDefaultWorkspaceResponse setBody(GetDefaultWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDefaultWorkspaceResponseBody getBody() {
        return this.body;
    }

}
