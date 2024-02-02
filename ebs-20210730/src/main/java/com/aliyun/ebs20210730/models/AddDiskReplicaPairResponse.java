// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class AddDiskReplicaPairResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDiskReplicaPairResponseBody body;

    public static AddDiskReplicaPairResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDiskReplicaPairResponse self = new AddDiskReplicaPairResponse();
        return TeaModel.build(map, self);
    }

    public AddDiskReplicaPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDiskReplicaPairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDiskReplicaPairResponse setBody(AddDiskReplicaPairResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDiskReplicaPairResponseBody getBody() {
        return this.body;
    }

}
