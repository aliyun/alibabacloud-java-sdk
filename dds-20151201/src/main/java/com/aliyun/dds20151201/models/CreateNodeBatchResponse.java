// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateNodeBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNodeBatchResponseBody body;

    public static CreateNodeBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeBatchResponse self = new CreateNodeBatchResponse();
        return TeaModel.build(map, self);
    }

    public CreateNodeBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNodeBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNodeBatchResponse setBody(CreateNodeBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNodeBatchResponseBody getBody() {
        return this.body;
    }

}
