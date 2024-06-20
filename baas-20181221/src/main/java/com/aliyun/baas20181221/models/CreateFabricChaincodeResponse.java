// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricChaincodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFabricChaincodeResponseBody body;

    public static CreateFabricChaincodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricChaincodeResponse self = new CreateFabricChaincodeResponse();
        return TeaModel.build(map, self);
    }

    public CreateFabricChaincodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFabricChaincodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFabricChaincodeResponse setBody(CreateFabricChaincodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFabricChaincodeResponseBody getBody() {
        return this.body;
    }

}
