// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StopDiskReplicaPairResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopDiskReplicaPairResponseBody body;

    public static StopDiskReplicaPairResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDiskReplicaPairResponse self = new StopDiskReplicaPairResponse();
        return TeaModel.build(map, self);
    }

    public StopDiskReplicaPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDiskReplicaPairResponse setBody(StopDiskReplicaPairResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDiskReplicaPairResponseBody getBody() {
        return this.body;
    }

}
