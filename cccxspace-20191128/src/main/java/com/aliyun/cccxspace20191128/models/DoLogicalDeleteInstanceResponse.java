// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class DoLogicalDeleteInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DoLogicalDeleteInstanceResponseBody body;

    public static DoLogicalDeleteInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DoLogicalDeleteInstanceResponse self = new DoLogicalDeleteInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DoLogicalDeleteInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DoLogicalDeleteInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DoLogicalDeleteInstanceResponse setBody(DoLogicalDeleteInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DoLogicalDeleteInstanceResponseBody getBody() {
        return this.body;
    }

}
