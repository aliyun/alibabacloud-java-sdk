// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpdatePrivateRdsClassResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePrivateRdsClassResponseBody body;

    public static UpdatePrivateRdsClassResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateRdsClassResponse self = new UpdatePrivateRdsClassResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateRdsClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePrivateRdsClassResponse setBody(UpdatePrivateRdsClassResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrivateRdsClassResponseBody getBody() {
        return this.body;
    }

}
