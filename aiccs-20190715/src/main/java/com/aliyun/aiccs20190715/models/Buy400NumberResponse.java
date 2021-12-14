// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class Buy400NumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Buy400NumberResponseBody body;

    public static Buy400NumberResponse build(java.util.Map<String, ?> map) throws Exception {
        Buy400NumberResponse self = new Buy400NumberResponse();
        return TeaModel.build(map, self);
    }

    public Buy400NumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Buy400NumberResponse setBody(Buy400NumberResponseBody body) {
        this.body = body;
        return this;
    }
    public Buy400NumberResponseBody getBody() {
        return this.body;
    }

}
