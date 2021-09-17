// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CheckOpenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckOpenResponseBody body;

    public static CheckOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckOpenResponse self = new CheckOpenResponse();
        return TeaModel.build(map, self);
    }

    public CheckOpenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckOpenResponse setBody(CheckOpenResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckOpenResponseBody getBody() {
        return this.body;
    }

}
