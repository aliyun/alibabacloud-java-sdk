// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateChainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateChainResponseBody body;

    public static CreateChainResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChainResponse self = new CreateChainResponse();
        return TeaModel.build(map, self);
    }

    public CreateChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChainResponse setBody(CreateChainResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChainResponseBody getBody() {
        return this.body;
    }

}
