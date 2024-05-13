// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DisableSchemaPropertyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableSchemaPropertyResponseBody body;

    public static DisableSchemaPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSchemaPropertyResponse self = new DisableSchemaPropertyResponse();
        return TeaModel.build(map, self);
    }

    public DisableSchemaPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableSchemaPropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableSchemaPropertyResponse setBody(DisableSchemaPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSchemaPropertyResponseBody getBody() {
        return this.body;
    }

}
