// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateGadOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGadOrderResponseBody body;

    public static CreateGadOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGadOrderResponse self = new CreateGadOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateGadOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGadOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGadOrderResponse setBody(CreateGadOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGadOrderResponseBody getBody() {
        return this.body;
    }

}
