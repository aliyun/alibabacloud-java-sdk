// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterLayoutResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCasterLayoutResponseBody body;

    public static DeleteCasterLayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterLayoutResponse self = new DeleteCasterLayoutResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCasterLayoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCasterLayoutResponse setBody(DeleteCasterLayoutResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCasterLayoutResponseBody getBody() {
        return this.body;
    }

}
