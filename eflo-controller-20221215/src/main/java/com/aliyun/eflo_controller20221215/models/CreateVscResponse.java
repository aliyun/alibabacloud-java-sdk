// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateVscResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVscResponseBody body;

    public static CreateVscResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVscResponse self = new CreateVscResponse();
        return TeaModel.build(map, self);
    }

    public CreateVscResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVscResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVscResponse setBody(CreateVscResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVscResponseBody getBody() {
        return this.body;
    }

}
