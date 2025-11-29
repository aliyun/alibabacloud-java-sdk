// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDBInstanceIPArrayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDBInstanceIPArrayResponseBody body;

    public static CreateDBInstanceIPArrayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceIPArrayResponse self = new CreateDBInstanceIPArrayResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceIPArrayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBInstanceIPArrayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDBInstanceIPArrayResponse setBody(CreateDBInstanceIPArrayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBInstanceIPArrayResponseBody getBody() {
        return this.body;
    }

}
