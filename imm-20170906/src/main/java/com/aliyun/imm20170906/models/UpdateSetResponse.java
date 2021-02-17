// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class UpdateSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSetResponseBody body;

    public static UpdateSetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSetResponse self = new UpdateSetResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSetResponse setBody(UpdateSetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSetResponseBody getBody() {
        return this.body;
    }

}
