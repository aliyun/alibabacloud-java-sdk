// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCreditInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCreditInfoResponseBody body;

    public static GetCreditInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCreditInfoResponse self = new GetCreditInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetCreditInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCreditInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCreditInfoResponse setBody(GetCreditInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCreditInfoResponseBody getBody() {
        return this.body;
    }

}
