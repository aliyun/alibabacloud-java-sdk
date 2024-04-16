// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class BatchRestoreModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchRestoreModelResponseBody body;

    public static BatchRestoreModelResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchRestoreModelResponse self = new BatchRestoreModelResponse();
        return TeaModel.build(map, self);
    }

    public BatchRestoreModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchRestoreModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchRestoreModelResponse setBody(BatchRestoreModelResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchRestoreModelResponseBody getBody() {
        return this.body;
    }

}
