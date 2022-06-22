// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetUserWorkspacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserWorkspacesResponseBody body;

    public static GetUserWorkspacesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserWorkspacesResponse self = new GetUserWorkspacesResponse();
        return TeaModel.build(map, self);
    }

    public GetUserWorkspacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserWorkspacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserWorkspacesResponse setBody(GetUserWorkspacesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserWorkspacesResponseBody getBody() {
        return this.body;
    }

}
