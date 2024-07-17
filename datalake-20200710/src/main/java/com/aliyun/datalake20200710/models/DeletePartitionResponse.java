// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeletePartitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePartitionResponseBody body;

    public static DeletePartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePartitionResponse self = new DeletePartitionResponse();
        return TeaModel.build(map, self);
    }

    public DeletePartitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePartitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePartitionResponse setBody(DeletePartitionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePartitionResponseBody getBody() {
        return this.body;
    }

}
