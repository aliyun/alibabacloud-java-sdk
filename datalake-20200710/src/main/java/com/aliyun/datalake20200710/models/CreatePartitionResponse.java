// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreatePartitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePartitionResponseBody body;

    public static CreatePartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePartitionResponse self = new CreatePartitionResponse();
        return TeaModel.build(map, self);
    }

    public CreatePartitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePartitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePartitionResponse setBody(CreatePartitionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePartitionResponseBody getBody() {
        return this.body;
    }

}
