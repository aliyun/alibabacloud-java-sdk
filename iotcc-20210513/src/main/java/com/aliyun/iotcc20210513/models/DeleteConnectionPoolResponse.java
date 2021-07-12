// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteConnectionPoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteConnectionPoolResponseBody body;

    public static DeleteConnectionPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnectionPoolResponse self = new DeleteConnectionPoolResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConnectionPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConnectionPoolResponse setBody(DeleteConnectionPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConnectionPoolResponseBody getBody() {
        return this.body;
    }

}
