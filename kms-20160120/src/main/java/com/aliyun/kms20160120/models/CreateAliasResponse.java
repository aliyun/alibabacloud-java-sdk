// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateAliasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAliasResponseBody body;

    public static CreateAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAliasResponse self = new CreateAliasResponse();
        return TeaModel.build(map, self);
    }

    public CreateAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAliasResponse setBody(CreateAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAliasResponseBody getBody() {
        return this.body;
    }

}
