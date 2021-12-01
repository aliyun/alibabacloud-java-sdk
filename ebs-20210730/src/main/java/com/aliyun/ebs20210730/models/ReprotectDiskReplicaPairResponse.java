// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ReprotectDiskReplicaPairResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReprotectDiskReplicaPairResponseBody body;

    public static ReprotectDiskReplicaPairResponse build(java.util.Map<String, ?> map) throws Exception {
        ReprotectDiskReplicaPairResponse self = new ReprotectDiskReplicaPairResponse();
        return TeaModel.build(map, self);
    }

    public ReprotectDiskReplicaPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReprotectDiskReplicaPairResponse setBody(ReprotectDiskReplicaPairResponseBody body) {
        this.body = body;
        return this;
    }
    public ReprotectDiskReplicaPairResponseBody getBody() {
        return this.body;
    }

}
