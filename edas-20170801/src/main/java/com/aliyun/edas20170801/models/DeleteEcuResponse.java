// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteEcuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEcuResponseBody body;

    public static DeleteEcuResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEcuResponse self = new DeleteEcuResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEcuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEcuResponse setBody(DeleteEcuResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEcuResponseBody getBody() {
        return this.body;
    }

}
