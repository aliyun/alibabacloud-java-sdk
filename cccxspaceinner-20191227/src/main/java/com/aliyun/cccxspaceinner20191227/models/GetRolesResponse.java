// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetRolesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRolesResponseBody body;

    public static GetRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRolesResponse self = new GetRolesResponse();
        return TeaModel.build(map, self);
    }

    public GetRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRolesResponse setBody(GetRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRolesResponseBody getBody() {
        return this.body;
    }

}
