// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class ValidatYunSmsIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidatYunSmsIdResponseBody body;

    public static ValidatYunSmsIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidatYunSmsIdResponse self = new ValidatYunSmsIdResponse();
        return TeaModel.build(map, self);
    }

    public ValidatYunSmsIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidatYunSmsIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidatYunSmsIdResponse setBody(ValidatYunSmsIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidatYunSmsIdResponseBody getBody() {
        return this.body;
    }

}
