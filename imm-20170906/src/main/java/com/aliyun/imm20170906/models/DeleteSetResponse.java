// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DeleteSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSetResponseBody body;

    public static DeleteSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSetResponse self = new DeleteSetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSetResponse setBody(DeleteSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSetResponseBody getBody() {
        return this.body;
    }

}
