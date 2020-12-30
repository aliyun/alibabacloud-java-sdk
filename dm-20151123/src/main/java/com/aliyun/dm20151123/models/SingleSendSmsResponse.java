// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SingleSendSmsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SingleSendSmsResponseBody body;

    public static SingleSendSmsResponse build(java.util.Map<String, ?> map) throws Exception {
        SingleSendSmsResponse self = new SingleSendSmsResponse();
        return TeaModel.build(map, self);
    }

    public SingleSendSmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SingleSendSmsResponse setBody(SingleSendSmsResponseBody body) {
        this.body = body;
        return this;
    }
    public SingleSendSmsResponseBody getBody() {
        return this.body;
    }

}
