// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReversedDisableReplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReversedDisableReplicationResponseBody body;

    public static ReversedDisableReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ReversedDisableReplicationResponse self = new ReversedDisableReplicationResponse();
        return TeaModel.build(map, self);
    }

    public ReversedDisableReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReversedDisableReplicationResponse setBody(ReversedDisableReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ReversedDisableReplicationResponseBody getBody() {
        return this.body;
    }

}
