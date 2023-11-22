// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateSearchIndexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSearchIndexResponseBody body;

    public static CreateSearchIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSearchIndexResponse self = new CreateSearchIndexResponse();
        return TeaModel.build(map, self);
    }

    public CreateSearchIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSearchIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSearchIndexResponse setBody(CreateSearchIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSearchIndexResponseBody getBody() {
        return this.body;
    }

}
