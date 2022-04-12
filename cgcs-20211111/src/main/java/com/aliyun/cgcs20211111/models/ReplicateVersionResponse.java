// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReplicateVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReplicateVersionResponseBody body;

    public static ReplicateVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplicateVersionResponse self = new ReplicateVersionResponse();
        return TeaModel.build(map, self);
    }

    public ReplicateVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplicateVersionResponse setBody(ReplicateVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplicateVersionResponseBody getBody() {
        return this.body;
    }

}
