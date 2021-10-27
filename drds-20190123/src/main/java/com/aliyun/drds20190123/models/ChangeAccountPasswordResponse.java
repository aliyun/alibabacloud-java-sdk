// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ChangeAccountPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeAccountPasswordResponseBody body;

    public static ChangeAccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeAccountPasswordResponse self = new ChangeAccountPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ChangeAccountPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeAccountPasswordResponse setBody(ChangeAccountPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeAccountPasswordResponseBody getBody() {
        return this.body;
    }

}
