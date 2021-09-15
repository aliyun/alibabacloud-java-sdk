// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class AddBuDBInstanceRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddBuDBInstanceRelationResponseBody body;

    public static AddBuDBInstanceRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBuDBInstanceRelationResponse self = new AddBuDBInstanceRelationResponse();
        return TeaModel.build(map, self);
    }

    public AddBuDBInstanceRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBuDBInstanceRelationResponse setBody(AddBuDBInstanceRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBuDBInstanceRelationResponseBody getBody() {
        return this.body;
    }

}
