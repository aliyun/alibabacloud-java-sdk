// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateGadInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGadInstanceResponseBody body;

    public static CreateGadInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGadInstanceResponse self = new CreateGadInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateGadInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGadInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGadInstanceResponse setBody(CreateGadInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGadInstanceResponseBody getBody() {
        return this.body;
    }

}
