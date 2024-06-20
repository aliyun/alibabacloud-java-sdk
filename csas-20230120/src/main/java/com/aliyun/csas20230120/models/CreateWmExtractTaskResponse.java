// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmExtractTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWmExtractTaskResponseBody body;

    public static CreateWmExtractTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWmExtractTaskResponse self = new CreateWmExtractTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateWmExtractTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWmExtractTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWmExtractTaskResponse setBody(CreateWmExtractTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWmExtractTaskResponseBody getBody() {
        return this.body;
    }

}
