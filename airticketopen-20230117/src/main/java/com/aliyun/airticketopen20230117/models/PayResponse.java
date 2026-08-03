// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class PayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PayResponseBody body;

    public static PayResponse build(java.util.Map<String, ?> map) throws Exception {
        PayResponse self = new PayResponse();
        return TeaModel.build(map, self);
    }

    public PayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PayResponse setBody(PayResponseBody body) {
        this.body = body;
        return this;
    }
    public PayResponseBody getBody() {
        return this.body;
    }

}
