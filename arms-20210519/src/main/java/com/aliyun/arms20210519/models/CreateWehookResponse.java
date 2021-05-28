// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class CreateWehookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateWehookResponseBody body;

    public static CreateWehookResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWehookResponse self = new CreateWehookResponse();
        return TeaModel.build(map, self);
    }

    public CreateWehookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWehookResponse setBody(CreateWehookResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWehookResponseBody getBody() {
        return this.body;
    }

}
