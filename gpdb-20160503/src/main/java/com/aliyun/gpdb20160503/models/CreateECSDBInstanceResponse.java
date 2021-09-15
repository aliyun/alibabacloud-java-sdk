// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateECSDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateECSDBInstanceResponseBody body;

    public static CreateECSDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateECSDBInstanceResponse self = new CreateECSDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateECSDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateECSDBInstanceResponse setBody(CreateECSDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateECSDBInstanceResponseBody getBody() {
        return this.body;
    }

}
