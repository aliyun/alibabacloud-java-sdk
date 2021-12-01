// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DeleteDiskReplicaPairResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDiskReplicaPairResponseBody body;

    public static DeleteDiskReplicaPairResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiskReplicaPairResponse self = new DeleteDiskReplicaPairResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDiskReplicaPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDiskReplicaPairResponse setBody(DeleteDiskReplicaPairResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDiskReplicaPairResponseBody getBody() {
        return this.body;
    }

}
