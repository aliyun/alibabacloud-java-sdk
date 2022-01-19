// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class JyGetMobileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public JyGetMobileResponseBody body;

    public static JyGetMobileResponse build(java.util.Map<String, ?> map) throws Exception {
        JyGetMobileResponse self = new JyGetMobileResponse();
        return TeaModel.build(map, self);
    }

    public JyGetMobileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JyGetMobileResponse setBody(JyGetMobileResponseBody body) {
        this.body = body;
        return this;
    }
    public JyGetMobileResponseBody getBody() {
        return this.body;
    }

}
