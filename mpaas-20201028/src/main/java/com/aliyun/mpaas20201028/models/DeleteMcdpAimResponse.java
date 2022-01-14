// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcdpAimResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMcdpAimResponseBody body;

    public static DeleteMcdpAimResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcdpAimResponse self = new DeleteMcdpAimResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMcdpAimResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMcdpAimResponse setBody(DeleteMcdpAimResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcdpAimResponseBody getBody() {
        return this.body;
    }

}
