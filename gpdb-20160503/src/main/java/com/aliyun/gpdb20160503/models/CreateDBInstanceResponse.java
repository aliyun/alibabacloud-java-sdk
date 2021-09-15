// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public CreateDBInstanceResponse setBody(CreateDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBInstanceResponseBody getBody() {
        return this.body;
    }

}
