// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateIceProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIceProjectResponseBody body;

    public static CreateIceProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIceProjectResponse self = new CreateIceProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateIceProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIceProjectResponse setBody(CreateIceProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIceProjectResponseBody getBody() {
        return this.body;
    }

}
