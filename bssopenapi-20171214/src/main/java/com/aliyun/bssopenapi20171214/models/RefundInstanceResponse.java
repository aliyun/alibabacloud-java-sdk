// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RefundInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefundInstanceResponseBody body;

    public static RefundInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundInstanceResponse self = new RefundInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RefundInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefundInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefundInstanceResponse setBody(RefundInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RefundInstanceResponseBody getBody() {
        return this.body;
    }

}
