// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_114952485.models;

import com.aliyun.tea.*;

public class ApidasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApidasResponseBody body;

    public static ApidasResponse build(java.util.Map<String, ?> map) throws Exception {
        ApidasResponse self = new ApidasResponse();
        return TeaModel.build(map, self);
    }

    public ApidasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApidasResponse setBody(ApidasResponseBody body) {
        this.body = body;
        return this;
    }
    public ApidasResponseBody getBody() {
        return this.body;
    }

}
