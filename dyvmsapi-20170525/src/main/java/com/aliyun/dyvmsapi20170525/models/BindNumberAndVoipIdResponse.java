// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class BindNumberAndVoipIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindNumberAndVoipIdResponseBody body;

    public static BindNumberAndVoipIdResponse build(java.util.Map<String, ?> map) throws Exception {
        BindNumberAndVoipIdResponse self = new BindNumberAndVoipIdResponse();
        return TeaModel.build(map, self);
    }

    public BindNumberAndVoipIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindNumberAndVoipIdResponse setBody(BindNumberAndVoipIdResponseBody body) {
        this.body = body;
        return this;
    }
    public BindNumberAndVoipIdResponseBody getBody() {
        return this.body;
    }

}
