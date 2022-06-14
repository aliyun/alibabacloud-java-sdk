// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDBInstanceResponseBody body;

    public static CreateDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceResponse self = new CreateDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDBInstanceResponse setBody(CreateDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBInstanceResponseBody getBody() {
        return this.body;
    }

}
