// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterComponentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCasterComponentResponseBody body;

    public static DeleteCasterComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterComponentResponse self = new DeleteCasterComponentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCasterComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCasterComponentResponse setBody(DeleteCasterComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCasterComponentResponseBody getBody() {
        return this.body;
    }

}
