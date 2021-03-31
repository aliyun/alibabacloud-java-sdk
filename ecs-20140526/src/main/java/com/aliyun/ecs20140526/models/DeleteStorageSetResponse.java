// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteStorageSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteStorageSetResponseBody body;

    public static DeleteStorageSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStorageSetResponse self = new DeleteStorageSetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStorageSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStorageSetResponse setBody(DeleteStorageSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStorageSetResponseBody getBody() {
        return this.body;
    }

}
