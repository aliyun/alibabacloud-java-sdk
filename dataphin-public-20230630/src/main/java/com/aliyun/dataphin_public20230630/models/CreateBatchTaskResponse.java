// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateBatchTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBatchTaskResponseBody body;

    public static CreateBatchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchTaskResponse self = new CreateBatchTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateBatchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBatchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBatchTaskResponse setBody(CreateBatchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBatchTaskResponseBody getBody() {
        return this.body;
    }

}
