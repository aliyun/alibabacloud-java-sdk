// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class EnableDiskGroupReplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableDiskGroupReplicationResponseBody body;

    public static EnableDiskGroupReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDiskGroupReplicationResponse self = new EnableDiskGroupReplicationResponse();
        return TeaModel.build(map, self);
    }

    public EnableDiskGroupReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDiskGroupReplicationResponse setBody(EnableDiskGroupReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDiskGroupReplicationResponseBody getBody() {
        return this.body;
    }

}
