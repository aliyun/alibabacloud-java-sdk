// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateOwnAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOwnAccountResponseBody body;

    public static CreateOwnAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOwnAccountResponse self = new CreateOwnAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateOwnAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOwnAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOwnAccountResponse setBody(CreateOwnAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOwnAccountResponseBody getBody() {
        return this.body;
    }

}
