// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gdb20190903.models;

import com.aliyun.tea.*;

public class CreateReadDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateReadDBInstanceResponseBody body;

    public static CreateReadDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReadDBInstanceResponse self = new CreateReadDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateReadDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateReadDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateReadDBInstanceResponse setBody(CreateReadDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReadDBInstanceResponseBody getBody() {
        return this.body;
    }

}
