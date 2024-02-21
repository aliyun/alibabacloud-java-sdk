// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateIndexTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIndexTemplateResponseBody body;

    public static CreateIndexTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIndexTemplateResponse self = new CreateIndexTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateIndexTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIndexTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIndexTemplateResponse setBody(CreateIndexTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIndexTemplateResponseBody getBody() {
        return this.body;
    }

}
