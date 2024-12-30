// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateBatchTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBatchTaskResponseBody body;

    public static UpdateBatchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBatchTaskResponse self = new UpdateBatchTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBatchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBatchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBatchTaskResponse setBody(UpdateBatchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBatchTaskResponseBody getBody() {
        return this.body;
    }

}
