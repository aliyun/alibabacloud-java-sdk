// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateSchemaSubscribeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSchemaSubscribeResponseBody body;

    public static CreateSchemaSubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSchemaSubscribeResponse self = new CreateSchemaSubscribeResponse();
        return TeaModel.build(map, self);
    }

    public CreateSchemaSubscribeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSchemaSubscribeResponse setBody(CreateSchemaSubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSchemaSubscribeResponseBody getBody() {
        return this.body;
    }

}
