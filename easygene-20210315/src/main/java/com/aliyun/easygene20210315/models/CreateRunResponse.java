// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateRunResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRunResponseBody body;

    public static CreateRunResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRunResponse self = new CreateRunResponse();
        return TeaModel.build(map, self);
    }

    public CreateRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRunResponse setBody(CreateRunResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRunResponseBody getBody() {
        return this.body;
    }

}
