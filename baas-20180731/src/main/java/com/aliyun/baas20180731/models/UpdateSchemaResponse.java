// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSchemaResponseBody body;

    public static UpdateSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSchemaResponse self = new UpdateSchemaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSchemaResponse setBody(UpdateSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSchemaResponseBody getBody() {
        return this.body;
    }

}
