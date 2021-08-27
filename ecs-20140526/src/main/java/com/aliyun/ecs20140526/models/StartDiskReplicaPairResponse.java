// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartDiskReplicaPairResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartDiskReplicaPairResponseBody body;

    public static StartDiskReplicaPairResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDiskReplicaPairResponse self = new StartDiskReplicaPairResponse();
        return TeaModel.build(map, self);
    }

    public StartDiskReplicaPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDiskReplicaPairResponse setBody(StartDiskReplicaPairResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDiskReplicaPairResponseBody getBody() {
        return this.body;
    }

}
