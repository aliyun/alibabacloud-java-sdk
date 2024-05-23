// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class CreateReadOnlyAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateReadOnlyAccountResponseBody body;

    public static CreateReadOnlyAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReadOnlyAccountResponse self = new CreateReadOnlyAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateReadOnlyAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateReadOnlyAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateReadOnlyAccountResponse setBody(CreateReadOnlyAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReadOnlyAccountResponseBody getBody() {
        return this.body;
    }

}
