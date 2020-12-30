// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CheckNumberAvaliableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckNumberAvaliableResponseBody body;

    public static CheckNumberAvaliableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckNumberAvaliableResponse self = new CheckNumberAvaliableResponse();
        return TeaModel.build(map, self);
    }

    public CheckNumberAvaliableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckNumberAvaliableResponse setBody(CheckNumberAvaliableResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckNumberAvaliableResponseBody getBody() {
        return this.body;
    }

}
