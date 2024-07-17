// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RenamePartitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenamePartitionResponseBody body;

    public static RenamePartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        RenamePartitionResponse self = new RenamePartitionResponse();
        return TeaModel.build(map, self);
    }

    public RenamePartitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenamePartitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenamePartitionResponse setBody(RenamePartitionResponseBody body) {
        this.body = body;
        return this;
    }
    public RenamePartitionResponseBody getBody() {
        return this.body;
    }

}
