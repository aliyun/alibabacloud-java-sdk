// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class RepairReplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RepairReplicationResponseBody body;

    public static RepairReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        RepairReplicationResponse self = new RepairReplicationResponse();
        return TeaModel.build(map, self);
    }

    public RepairReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RepairReplicationResponse setBody(RepairReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public RepairReplicationResponseBody getBody() {
        return this.body;
    }

}
