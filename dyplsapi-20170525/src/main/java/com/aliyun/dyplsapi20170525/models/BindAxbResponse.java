// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindAxbResponseBody body;

    public static BindAxbResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAxbResponse self = new BindAxbResponse();
        return TeaModel.build(map, self);
    }

    public BindAxbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindAxbResponse setBody(BindAxbResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAxbResponseBody getBody() {
        return this.body;
    }

}
