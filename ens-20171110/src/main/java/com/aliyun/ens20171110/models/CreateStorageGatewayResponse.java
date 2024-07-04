// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateStorageGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStorageGatewayResponseBody body;

    public static CreateStorageGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageGatewayResponse self = new CreateStorageGatewayResponse();
        return TeaModel.build(map, self);
    }

    public CreateStorageGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStorageGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStorageGatewayResponse setBody(CreateStorageGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStorageGatewayResponseBody getBody() {
        return this.body;
    }

}
