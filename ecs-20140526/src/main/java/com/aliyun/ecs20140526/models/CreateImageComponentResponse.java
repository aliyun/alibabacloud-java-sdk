// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImageComponentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateImageComponentResponseBody body;

    public static CreateImageComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageComponentResponse self = new CreateImageComponentResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageComponentResponse setBody(CreateImageComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageComponentResponseBody getBody() {
        return this.body;
    }

}
