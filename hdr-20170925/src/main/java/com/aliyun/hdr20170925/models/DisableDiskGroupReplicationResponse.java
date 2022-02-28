// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DisableDiskGroupReplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableDiskGroupReplicationResponseBody body;

    public static DisableDiskGroupReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDiskGroupReplicationResponse self = new DisableDiskGroupReplicationResponse();
        return TeaModel.build(map, self);
    }

    public DisableDiskGroupReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDiskGroupReplicationResponse setBody(DisableDiskGroupReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDiskGroupReplicationResponseBody getBody() {
        return this.body;
    }

}
