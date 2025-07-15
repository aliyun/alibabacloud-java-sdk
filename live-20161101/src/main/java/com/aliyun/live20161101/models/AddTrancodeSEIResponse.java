// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddTrancodeSEIResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddTrancodeSEIResponseBody body;

    public static AddTrancodeSEIResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTrancodeSEIResponse self = new AddTrancodeSEIResponse();
        return TeaModel.build(map, self);
    }

    public AddTrancodeSEIResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTrancodeSEIResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTrancodeSEIResponse setBody(AddTrancodeSEIResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTrancodeSEIResponseBody getBody() {
        return this.body;
    }

}
