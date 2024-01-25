// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CreateDumpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDumpResponseBody body;

    public static CreateDumpResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDumpResponse self = new CreateDumpResponse();
        return TeaModel.build(map, self);
    }

    public CreateDumpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDumpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDumpResponse setBody(CreateDumpResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDumpResponseBody getBody() {
        return this.body;
    }

}
