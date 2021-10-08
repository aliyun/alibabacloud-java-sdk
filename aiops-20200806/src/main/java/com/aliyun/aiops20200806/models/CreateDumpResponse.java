// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CreateDumpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateDumpResponse setBody(CreateDumpResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDumpResponseBody getBody() {
        return this.body;
    }

}
