// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RepayForPayUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RepayForPayUrlResponseBody body;

    public static RepayForPayUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        RepayForPayUrlResponse self = new RepayForPayUrlResponse();
        return TeaModel.build(map, self);
    }

    public RepayForPayUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RepayForPayUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RepayForPayUrlResponse setBody(RepayForPayUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public RepayForPayUrlResponseBody getBody() {
        return this.body;
    }

}
