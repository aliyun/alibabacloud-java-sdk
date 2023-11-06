// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveInstanceAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveInstanceAccountResponseBody body;

    public static RemoveInstanceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstanceAccountResponse self = new RemoveInstanceAccountResponse();
        return TeaModel.build(map, self);
    }

    public RemoveInstanceAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveInstanceAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveInstanceAccountResponse setBody(RemoveInstanceAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveInstanceAccountResponseBody getBody() {
        return this.body;
    }

}
