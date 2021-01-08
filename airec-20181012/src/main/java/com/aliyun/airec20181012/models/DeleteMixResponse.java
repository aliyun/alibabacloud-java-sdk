// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DeleteMixResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMixResponseBody body;

    public static DeleteMixResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMixResponse self = new DeleteMixResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMixResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMixResponse setBody(DeleteMixResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMixResponseBody getBody() {
        return this.body;
    }

}
