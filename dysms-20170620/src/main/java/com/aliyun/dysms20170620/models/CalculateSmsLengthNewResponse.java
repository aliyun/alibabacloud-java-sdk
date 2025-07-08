// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CalculateSmsLengthNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CalculateSmsLengthNewResponseBody body;

    public static CalculateSmsLengthNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CalculateSmsLengthNewResponse self = new CalculateSmsLengthNewResponse();
        return TeaModel.build(map, self);
    }

    public CalculateSmsLengthNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CalculateSmsLengthNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CalculateSmsLengthNewResponse setBody(CalculateSmsLengthNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CalculateSmsLengthNewResponseBody getBody() {
        return this.body;
    }

}
