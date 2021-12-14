// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class Destory400NumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Destory400NumberResponseBody body;

    public static Destory400NumberResponse build(java.util.Map<String, ?> map) throws Exception {
        Destory400NumberResponse self = new Destory400NumberResponse();
        return TeaModel.build(map, self);
    }

    public Destory400NumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Destory400NumberResponse setBody(Destory400NumberResponseBody body) {
        this.body = body;
        return this;
    }
    public Destory400NumberResponseBody getBody() {
        return this.body;
    }

}
