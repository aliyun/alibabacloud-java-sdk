// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReversedEnableReplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReversedEnableReplicationResponseBody body;

    public static ReversedEnableReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ReversedEnableReplicationResponse self = new ReversedEnableReplicationResponse();
        return TeaModel.build(map, self);
    }

    public ReversedEnableReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReversedEnableReplicationResponse setBody(ReversedEnableReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ReversedEnableReplicationResponseBody getBody() {
        return this.body;
    }

}
