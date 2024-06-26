// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateChaincodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateChaincodeResponseBody body;

    public static CreateChaincodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChaincodeResponse self = new CreateChaincodeResponse();
        return TeaModel.build(map, self);
    }

    public CreateChaincodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChaincodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateChaincodeResponse setBody(CreateChaincodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChaincodeResponseBody getBody() {
        return this.body;
    }

}
