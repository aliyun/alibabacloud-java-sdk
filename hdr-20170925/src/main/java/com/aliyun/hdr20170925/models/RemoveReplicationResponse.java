// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class RemoveReplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveReplicationResponseBody body;

    public static RemoveReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveReplicationResponse self = new RemoveReplicationResponse();
        return TeaModel.build(map, self);
    }

    public RemoveReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveReplicationResponse setBody(RemoveReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveReplicationResponseBody getBody() {
        return this.body;
    }

}
