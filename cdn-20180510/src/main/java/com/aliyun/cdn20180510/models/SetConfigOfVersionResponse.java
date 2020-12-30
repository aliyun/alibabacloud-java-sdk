// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetConfigOfVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetConfigOfVersionResponseBody body;

    public static SetConfigOfVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetConfigOfVersionResponse self = new SetConfigOfVersionResponse();
        return TeaModel.build(map, self);
    }

    public SetConfigOfVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetConfigOfVersionResponse setBody(SetConfigOfVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetConfigOfVersionResponseBody getBody() {
        return this.body;
    }

}
