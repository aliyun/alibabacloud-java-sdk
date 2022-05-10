// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AddQRCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddQRCodeResponseBody body;

    public static AddQRCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddQRCodeResponse self = new AddQRCodeResponse();
        return TeaModel.build(map, self);
    }

    public AddQRCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddQRCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddQRCodeResponse setBody(AddQRCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddQRCodeResponseBody getBody() {
        return this.body;
    }

}
