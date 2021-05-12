// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateEnvironmentNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEnvironmentNodeResponseBody body;

    public static CreateEnvironmentNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentNodeResponse self = new CreateEnvironmentNodeResponse();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEnvironmentNodeResponse setBody(CreateEnvironmentNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnvironmentNodeResponseBody getBody() {
        return this.body;
    }

}
