// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateShadowSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateShadowSchemaResponseBody body;

    public static UpdateShadowSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateShadowSchemaResponse self = new UpdateShadowSchemaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateShadowSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateShadowSchemaResponse setBody(UpdateShadowSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateShadowSchemaResponseBody getBody() {
        return this.body;
    }

}
