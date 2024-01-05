// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class CreateGraphSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGraphSchemaResponseBody body;

    public static CreateGraphSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGraphSchemaResponse self = new CreateGraphSchemaResponse();
        return TeaModel.build(map, self);
    }

    public CreateGraphSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGraphSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGraphSchemaResponse setBody(CreateGraphSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGraphSchemaResponseBody getBody() {
        return this.body;
    }

}
