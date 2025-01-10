// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class RefundVccResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefundVccResponseBody body;

    public static RefundVccResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundVccResponse self = new RefundVccResponse();
        return TeaModel.build(map, self);
    }

    public RefundVccResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefundVccResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefundVccResponse setBody(RefundVccResponseBody body) {
        this.body = body;
        return this;
    }
    public RefundVccResponseBody getBody() {
        return this.body;
    }

}
