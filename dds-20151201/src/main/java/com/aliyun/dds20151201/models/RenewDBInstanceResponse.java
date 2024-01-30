// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class RenewDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewDBInstanceResponseBody body;

    public static RenewDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewDBInstanceResponse self = new RenewDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RenewDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewDBInstanceResponse setBody(RenewDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewDBInstanceResponseBody getBody() {
        return this.body;
    }

}
