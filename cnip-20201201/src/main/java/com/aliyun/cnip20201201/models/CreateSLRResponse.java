// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateSLRResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSLRResponseBody body;

    public static CreateSLRResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSLRResponse self = new CreateSLRResponse();
        return TeaModel.build(map, self);
    }

    public CreateSLRResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSLRResponse setBody(CreateSLRResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSLRResponseBody getBody() {
        return this.body;
    }

}
