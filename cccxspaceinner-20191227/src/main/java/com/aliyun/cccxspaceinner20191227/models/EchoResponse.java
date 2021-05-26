// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class EchoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EchoResponseBody body;

    public static EchoResponse build(java.util.Map<String, ?> map) throws Exception {
        EchoResponse self = new EchoResponse();
        return TeaModel.build(map, self);
    }

    public EchoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EchoResponse setBody(EchoResponseBody body) {
        this.body = body;
        return this;
    }
    public EchoResponseBody getBody() {
        return this.body;
    }

}
