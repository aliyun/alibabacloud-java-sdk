// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSchemaResponseBody body;

    public static DeleteSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchemaResponse self = new DeleteSchemaResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSchemaResponse setBody(DeleteSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSchemaResponseBody getBody() {
        return this.body;
    }

}
