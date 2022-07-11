// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class EnablePhysicalConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnablePhysicalConnectionResponseBody body;

    public static EnablePhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        EnablePhysicalConnectionResponse self = new EnablePhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public EnablePhysicalConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnablePhysicalConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnablePhysicalConnectionResponse setBody(EnablePhysicalConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public EnablePhysicalConnectionResponseBody getBody() {
        return this.body;
    }

}
