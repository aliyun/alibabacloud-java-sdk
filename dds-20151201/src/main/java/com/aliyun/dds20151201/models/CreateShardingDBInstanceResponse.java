// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateShardingDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateShardingDBInstanceResponseBody body;

    public static CreateShardingDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateShardingDBInstanceResponse self = new CreateShardingDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateShardingDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateShardingDBInstanceResponse setBody(CreateShardingDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateShardingDBInstanceResponseBody getBody() {
        return this.body;
    }

}
