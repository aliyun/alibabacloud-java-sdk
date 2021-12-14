// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateLindormInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLindormInstanceResponseBody body;

    public static CreateLindormInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLindormInstanceResponse self = new CreateLindormInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateLindormInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLindormInstanceResponse setBody(CreateLindormInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLindormInstanceResponseBody getBody() {
        return this.body;
    }

}
