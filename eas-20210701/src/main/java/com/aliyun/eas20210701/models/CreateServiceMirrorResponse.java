// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceMirrorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateServiceMirrorResponseBody body;

    public static CreateServiceMirrorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceMirrorResponse self = new CreateServiceMirrorResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceMirrorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceMirrorResponse setBody(CreateServiceMirrorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceMirrorResponseBody getBody() {
        return this.body;
    }

}
