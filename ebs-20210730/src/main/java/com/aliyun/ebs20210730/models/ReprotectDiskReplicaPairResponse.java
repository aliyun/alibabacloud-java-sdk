// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ReprotectDiskReplicaPairResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ReprotectDiskReplicaPairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReprotectDiskReplicaPairResponse setBody(ReprotectDiskReplicaPairResponseBody body) {
        this.body = body;
        return this;
    }
    public ReprotectDiskReplicaPairResponseBody getBody() {
        return this.body;
    }

}
