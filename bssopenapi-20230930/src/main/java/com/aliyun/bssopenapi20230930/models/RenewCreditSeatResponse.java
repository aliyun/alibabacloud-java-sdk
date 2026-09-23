// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class RenewCreditSeatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewCreditSeatResponseBody body;

    public static RenewCreditSeatResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewCreditSeatResponse self = new RenewCreditSeatResponse();
        return TeaModel.build(map, self);
    }

    public RenewCreditSeatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewCreditSeatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewCreditSeatResponse setBody(RenewCreditSeatResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewCreditSeatResponseBody getBody() {
        return this.body;
    }

}
