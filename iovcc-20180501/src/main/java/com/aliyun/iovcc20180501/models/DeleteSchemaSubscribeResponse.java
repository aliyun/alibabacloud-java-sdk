// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteSchemaSubscribeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSchemaSubscribeResponseBody body;

    public static DeleteSchemaSubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchemaSubscribeResponse self = new DeleteSchemaSubscribeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSchemaSubscribeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSchemaSubscribeResponse setBody(DeleteSchemaSubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSchemaSubscribeResponseBody getBody() {
        return this.body;
    }

}
