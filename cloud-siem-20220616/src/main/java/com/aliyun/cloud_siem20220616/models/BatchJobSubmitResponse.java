// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class BatchJobSubmitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchJobSubmitResponseBody body;

    public static BatchJobSubmitResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchJobSubmitResponse self = new BatchJobSubmitResponse();
        return TeaModel.build(map, self);
    }

    public BatchJobSubmitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchJobSubmitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchJobSubmitResponse setBody(BatchJobSubmitResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchJobSubmitResponseBody getBody() {
        return this.body;
    }

}
