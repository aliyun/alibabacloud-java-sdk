// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class GetAccountProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccountProjectResponseBody body;

    public static GetAccountProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountProjectResponse self = new GetAccountProjectResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountProjectResponse setBody(GetAccountProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountProjectResponseBody getBody() {
        return this.body;
    }

}
