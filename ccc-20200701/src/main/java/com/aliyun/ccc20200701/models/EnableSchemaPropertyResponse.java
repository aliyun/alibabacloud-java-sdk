// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class EnableSchemaPropertyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableSchemaPropertyResponseBody body;

    public static EnableSchemaPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSchemaPropertyResponse self = new EnableSchemaPropertyResponse();
        return TeaModel.build(map, self);
    }

    public EnableSchemaPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSchemaPropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableSchemaPropertyResponse setBody(EnableSchemaPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSchemaPropertyResponseBody getBody() {
        return this.body;
    }

}
