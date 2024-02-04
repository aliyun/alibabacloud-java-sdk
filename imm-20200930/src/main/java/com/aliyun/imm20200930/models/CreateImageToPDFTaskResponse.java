// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageToPDFTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateImageToPDFTaskResponseBody body;

    public static CreateImageToPDFTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageToPDFTaskResponse self = new CreateImageToPDFTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageToPDFTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageToPDFTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateImageToPDFTaskResponse setBody(CreateImageToPDFTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageToPDFTaskResponseBody getBody() {
        return this.body;
    }

}
