// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDiskResponseBody body;

    public static DeleteDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiskResponse self = new DeleteDiskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDiskResponse setBody(DeleteDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDiskResponseBody getBody() {
        return this.body;
    }

}
