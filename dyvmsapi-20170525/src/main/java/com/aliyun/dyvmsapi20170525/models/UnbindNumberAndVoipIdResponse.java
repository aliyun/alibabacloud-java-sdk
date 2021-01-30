// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class UnbindNumberAndVoipIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindNumberAndVoipIdResponseBody body;

    public static UnbindNumberAndVoipIdResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindNumberAndVoipIdResponse self = new UnbindNumberAndVoipIdResponse();
        return TeaModel.build(map, self);
    }

    public UnbindNumberAndVoipIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindNumberAndVoipIdResponse setBody(UnbindNumberAndVoipIdResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindNumberAndVoipIdResponseBody getBody() {
        return this.body;
    }

}
