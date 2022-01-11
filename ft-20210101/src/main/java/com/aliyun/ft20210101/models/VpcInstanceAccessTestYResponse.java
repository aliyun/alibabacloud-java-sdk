// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class VpcInstanceAccessTestYResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VpcInstanceAccessTestYResponseBody body;

    public static VpcInstanceAccessTestYResponse build(java.util.Map<String, ?> map) throws Exception {
        VpcInstanceAccessTestYResponse self = new VpcInstanceAccessTestYResponse();
        return TeaModel.build(map, self);
    }

    public VpcInstanceAccessTestYResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VpcInstanceAccessTestYResponse setBody(VpcInstanceAccessTestYResponseBody body) {
        this.body = body;
        return this;
    }
    public VpcInstanceAccessTestYResponseBody getBody() {
        return this.body;
    }

}
