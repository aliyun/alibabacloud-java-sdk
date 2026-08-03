// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ValidatePriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidatePriceResponseBody body;

    public static ValidatePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidatePriceResponse self = new ValidatePriceResponse();
        return TeaModel.build(map, self);
    }

    public ValidatePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidatePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidatePriceResponse setBody(ValidatePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidatePriceResponseBody getBody() {
        return this.body;
    }

}
