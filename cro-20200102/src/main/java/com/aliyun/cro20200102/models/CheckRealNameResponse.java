// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class CheckRealNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckRealNameResponseBody body;

    public static CheckRealNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckRealNameResponse self = new CheckRealNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckRealNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckRealNameResponse setBody(CheckRealNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckRealNameResponseBody getBody() {
        return this.body;
    }

}
