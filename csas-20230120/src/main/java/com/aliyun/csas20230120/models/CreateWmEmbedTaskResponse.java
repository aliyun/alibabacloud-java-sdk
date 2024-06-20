// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmEmbedTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWmEmbedTaskResponseBody body;

    public static CreateWmEmbedTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWmEmbedTaskResponse self = new CreateWmEmbedTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateWmEmbedTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWmEmbedTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWmEmbedTaskResponse setBody(CreateWmEmbedTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWmEmbedTaskResponseBody getBody() {
        return this.body;
    }

}
