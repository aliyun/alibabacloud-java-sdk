// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteShadowSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteShadowSchemaResponseBody body;

    public static DeleteShadowSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteShadowSchemaResponse self = new DeleteShadowSchemaResponse();
        return TeaModel.build(map, self);
    }

    public DeleteShadowSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteShadowSchemaResponse setBody(DeleteShadowSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteShadowSchemaResponseBody getBody() {
        return this.body;
    }

}
