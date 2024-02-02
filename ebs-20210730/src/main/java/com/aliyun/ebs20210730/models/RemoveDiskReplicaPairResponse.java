// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class RemoveDiskReplicaPairResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveDiskReplicaPairResponseBody body;

    public static RemoveDiskReplicaPairResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDiskReplicaPairResponse self = new RemoveDiskReplicaPairResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDiskReplicaPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDiskReplicaPairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveDiskReplicaPairResponse setBody(RemoveDiskReplicaPairResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDiskReplicaPairResponseBody getBody() {
        return this.body;
    }

}
