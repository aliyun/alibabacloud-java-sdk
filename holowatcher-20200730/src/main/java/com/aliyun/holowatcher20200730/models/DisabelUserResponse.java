// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DisabelUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisabelUserResponseBody body;

    public static DisabelUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DisabelUserResponse self = new DisabelUserResponse();
        return TeaModel.build(map, self);
    }

    public DisabelUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisabelUserResponse setBody(DisabelUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DisabelUserResponseBody getBody() {
        return this.body;
    }

}
