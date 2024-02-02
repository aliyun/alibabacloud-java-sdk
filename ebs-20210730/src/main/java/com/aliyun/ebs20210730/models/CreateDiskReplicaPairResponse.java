// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateDiskReplicaPairResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDiskReplicaPairResponseBody body;

    public static CreateDiskReplicaPairResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskReplicaPairResponse self = new CreateDiskReplicaPairResponse();
        return TeaModel.build(map, self);
    }

    public CreateDiskReplicaPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDiskReplicaPairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDiskReplicaPairResponse setBody(CreateDiskReplicaPairResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDiskReplicaPairResponseBody getBody() {
        return this.body;
    }

}
