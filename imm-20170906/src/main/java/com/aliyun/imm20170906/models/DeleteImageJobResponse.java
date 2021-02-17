// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DeleteImageJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteImageJobResponseBody body;

    public static DeleteImageJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageJobResponse self = new DeleteImageJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteImageJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteImageJobResponse setBody(DeleteImageJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteImageJobResponseBody getBody() {
        return this.body;
    }

}
