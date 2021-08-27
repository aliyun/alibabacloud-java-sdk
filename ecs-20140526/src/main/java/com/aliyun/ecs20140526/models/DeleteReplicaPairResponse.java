// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteReplicaPairResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteReplicaPairResponseBody body;

    public static DeleteReplicaPairResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteReplicaPairResponse self = new DeleteReplicaPairResponse();
        return TeaModel.build(map, self);
    }

    public DeleteReplicaPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteReplicaPairResponse setBody(DeleteReplicaPairResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteReplicaPairResponseBody getBody() {
        return this.body;
    }

}
