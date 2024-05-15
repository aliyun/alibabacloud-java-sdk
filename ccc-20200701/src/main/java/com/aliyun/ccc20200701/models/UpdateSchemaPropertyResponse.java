// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UpdateSchemaPropertyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSchemaPropertyResponseBody body;

    public static UpdateSchemaPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSchemaPropertyResponse self = new UpdateSchemaPropertyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSchemaPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSchemaPropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSchemaPropertyResponse setBody(UpdateSchemaPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSchemaPropertyResponseBody getBody() {
        return this.body;
    }

}
