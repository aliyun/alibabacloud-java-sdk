// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateUpstreamAppServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUpstreamAppServerResponseBody body;

    public static CreateUpstreamAppServerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUpstreamAppServerResponse self = new CreateUpstreamAppServerResponse();
        return TeaModel.build(map, self);
    }

    public CreateUpstreamAppServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUpstreamAppServerResponse setBody(CreateUpstreamAppServerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUpstreamAppServerResponseBody getBody() {
        return this.body;
    }

}
