// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIndexResponseBody body;

    public static CreateIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIndexResponse self = new CreateIndexResponse();
        return TeaModel.build(map, self);
    }

    public CreateIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIndexResponse setBody(CreateIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIndexResponseBody getBody() {
        return this.body;
    }

}
