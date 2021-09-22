// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class DisableOperationServiceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableOperationServiceInstanceResponseBody body;

    public static DisableOperationServiceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableOperationServiceInstanceResponse self = new DisableOperationServiceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DisableOperationServiceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableOperationServiceInstanceResponse setBody(DisableOperationServiceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableOperationServiceInstanceResponseBody getBody() {
        return this.body;
    }

}
