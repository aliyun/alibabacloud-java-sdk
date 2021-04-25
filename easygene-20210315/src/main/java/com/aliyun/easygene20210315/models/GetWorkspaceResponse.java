// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWorkspaceResponseBody body;

    public static GetWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceResponse self = new GetWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkspaceResponse setBody(GetWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkspaceResponseBody getBody() {
        return this.body;
    }

}
