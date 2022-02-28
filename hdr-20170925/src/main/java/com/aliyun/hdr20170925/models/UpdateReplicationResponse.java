// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateReplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateReplicationResponseBody body;

    public static UpdateReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateReplicationResponse self = new UpdateReplicationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateReplicationResponse setBody(UpdateReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateReplicationResponseBody getBody() {
        return this.body;
    }

}
