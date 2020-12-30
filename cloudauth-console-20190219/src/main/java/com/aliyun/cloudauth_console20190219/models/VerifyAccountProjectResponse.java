// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class VerifyAccountProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyAccountProjectResponseBody body;

    public static VerifyAccountProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyAccountProjectResponse self = new VerifyAccountProjectResponse();
        return TeaModel.build(map, self);
    }

    public VerifyAccountProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyAccountProjectResponse setBody(VerifyAccountProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyAccountProjectResponseBody getBody() {
        return this.body;
    }

}
