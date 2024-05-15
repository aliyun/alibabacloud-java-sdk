// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSchemaResponseBody body;

    public static CreateSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSchemaResponse self = new CreateSchemaResponse();
        return TeaModel.build(map, self);
    }

    public CreateSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSchemaResponse setBody(CreateSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSchemaResponseBody getBody() {
        return this.body;
    }

}
