// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RenewChangeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewChangeInstanceResponseBody body;

    public static RenewChangeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewChangeInstanceResponse self = new RenewChangeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RenewChangeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewChangeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewChangeInstanceResponse setBody(RenewChangeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewChangeInstanceResponseBody getBody() {
        return this.body;
    }

}
