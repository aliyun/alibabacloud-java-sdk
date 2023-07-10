// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateVectorIndexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVectorIndexResponseBody body;

    public static CreateVectorIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVectorIndexResponse self = new CreateVectorIndexResponse();
        return TeaModel.build(map, self);
    }

    public CreateVectorIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVectorIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVectorIndexResponse setBody(CreateVectorIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVectorIndexResponseBody getBody() {
        return this.body;
    }

}
