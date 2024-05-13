// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteSchemaPropertyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSchemaPropertyResponseBody body;

    public static DeleteSchemaPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchemaPropertyResponse self = new DeleteSchemaPropertyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSchemaPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSchemaPropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSchemaPropertyResponse setBody(DeleteSchemaPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSchemaPropertyResponseBody getBody() {
        return this.body;
    }

}
