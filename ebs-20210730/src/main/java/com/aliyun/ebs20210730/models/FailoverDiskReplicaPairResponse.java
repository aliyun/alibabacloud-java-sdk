// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class FailoverDiskReplicaPairResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FailoverDiskReplicaPairResponseBody body;

    public static FailoverDiskReplicaPairResponse build(java.util.Map<String, ?> map) throws Exception {
        FailoverDiskReplicaPairResponse self = new FailoverDiskReplicaPairResponse();
        return TeaModel.build(map, self);
    }

    public FailoverDiskReplicaPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FailoverDiskReplicaPairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FailoverDiskReplicaPairResponse setBody(FailoverDiskReplicaPairResponseBody body) {
        this.body = body;
        return this;
    }
    public FailoverDiskReplicaPairResponseBody getBody() {
        return this.body;
    }

}
