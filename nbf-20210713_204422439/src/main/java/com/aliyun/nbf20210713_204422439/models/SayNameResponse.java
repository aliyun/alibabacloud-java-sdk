// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210713_204422439.models;

import com.aliyun.tea.*;

public class SayNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public java.io.InputStream body;

    public static SayNameResponse build(java.util.Map<String, ?> map) throws Exception {
        SayNameResponse self = new SayNameResponse();
        return TeaModel.build(map, self);
    }

    public SayNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SayNameResponse setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
