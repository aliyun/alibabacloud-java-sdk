// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddSchemaPropertyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSchemaPropertyResponseBody body;

    public static AddSchemaPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSchemaPropertyResponse self = new AddSchemaPropertyResponse();
        return TeaModel.build(map, self);
    }

    public AddSchemaPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSchemaPropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSchemaPropertyResponse setBody(AddSchemaPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSchemaPropertyResponseBody getBody() {
        return this.body;
    }

}
