// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddSeataServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddSeataServerResponseBody body;

    public static AddSeataServerResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSeataServerResponse self = new AddSeataServerResponse();
        return TeaModel.build(map, self);
    }

    public AddSeataServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSeataServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSeataServerResponse setBody(AddSeataServerResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSeataServerResponseBody getBody() {
        return this.body;
    }

}
