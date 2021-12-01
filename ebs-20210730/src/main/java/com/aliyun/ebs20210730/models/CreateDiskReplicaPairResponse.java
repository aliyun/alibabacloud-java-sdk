// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateDiskReplicaPairResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDiskReplicaPairResponseBody body;

    public static CreateDiskReplicaPairResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskReplicaPairResponse self = new CreateDiskReplicaPairResponse();
        return TeaModel.build(map, self);
    }

    public CreateDiskReplicaPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDiskReplicaPairResponse setBody(CreateDiskReplicaPairResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDiskReplicaPairResponseBody getBody() {
        return this.body;
    }

}
