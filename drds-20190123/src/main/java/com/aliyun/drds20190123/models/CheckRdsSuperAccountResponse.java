// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckRdsSuperAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckRdsSuperAccountResponseBody body;

    public static CheckRdsSuperAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckRdsSuperAccountResponse self = new CheckRdsSuperAccountResponse();
        return TeaModel.build(map, self);
    }

    public CheckRdsSuperAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckRdsSuperAccountResponse setBody(CheckRdsSuperAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckRdsSuperAccountResponseBody getBody() {
        return this.body;
    }

}
