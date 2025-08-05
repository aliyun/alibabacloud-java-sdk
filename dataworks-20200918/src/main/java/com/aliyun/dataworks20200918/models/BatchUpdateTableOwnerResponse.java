// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class BatchUpdateTableOwnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUpdateTableOwnerResponseBody body;

    public static BatchUpdateTableOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateTableOwnerResponse self = new BatchUpdateTableOwnerResponse();
        return TeaModel.build(map, self);
    }

    public BatchUpdateTableOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUpdateTableOwnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUpdateTableOwnerResponse setBody(BatchUpdateTableOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdateTableOwnerResponseBody getBody() {
        return this.body;
    }

}
