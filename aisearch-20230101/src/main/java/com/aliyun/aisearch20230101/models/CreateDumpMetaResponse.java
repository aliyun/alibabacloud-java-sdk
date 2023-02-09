// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class CreateDumpMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDumpMetaResponseBody body;

    public static CreateDumpMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDumpMetaResponse self = new CreateDumpMetaResponse();
        return TeaModel.build(map, self);
    }

    public CreateDumpMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDumpMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDumpMetaResponse setBody(CreateDumpMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDumpMetaResponseBody getBody() {
        return this.body;
    }

}
