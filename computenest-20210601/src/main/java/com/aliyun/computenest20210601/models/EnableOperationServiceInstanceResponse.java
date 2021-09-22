// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class EnableOperationServiceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableOperationServiceInstanceResponseBody body;

    public static EnableOperationServiceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableOperationServiceInstanceResponse self = new EnableOperationServiceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public EnableOperationServiceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableOperationServiceInstanceResponse setBody(EnableOperationServiceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableOperationServiceInstanceResponseBody getBody() {
        return this.body;
    }

}
