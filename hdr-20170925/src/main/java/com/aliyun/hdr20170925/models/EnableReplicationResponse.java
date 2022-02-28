// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class EnableReplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableReplicationResponseBody body;

    public static EnableReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableReplicationResponse self = new EnableReplicationResponse();
        return TeaModel.build(map, self);
    }

    public EnableReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableReplicationResponse setBody(EnableReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableReplicationResponseBody getBody() {
        return this.body;
    }

}
