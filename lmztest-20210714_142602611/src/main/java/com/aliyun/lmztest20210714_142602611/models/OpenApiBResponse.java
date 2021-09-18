// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210714_142602611.models;

import com.aliyun.tea.*;

public class OpenApiBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenApiBResponseBody body;

    public static OpenApiBResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenApiBResponse self = new OpenApiBResponse();
        return TeaModel.build(map, self);
    }

    public OpenApiBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenApiBResponse setBody(OpenApiBResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenApiBResponseBody getBody() {
        return this.body;
    }

}
