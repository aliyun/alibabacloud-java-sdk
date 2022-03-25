// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ActivateUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ActivateUserResponseBody body;

    public static ActivateUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateUserResponse self = new ActivateUserResponse();
        return TeaModel.build(map, self);
    }

    public ActivateUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateUserResponse setBody(ActivateUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateUserResponseBody getBody() {
        return this.body;
    }

}
