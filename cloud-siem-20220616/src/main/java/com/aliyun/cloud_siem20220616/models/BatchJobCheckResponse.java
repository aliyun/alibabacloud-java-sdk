// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class BatchJobCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchJobCheckResponseBody body;

    public static BatchJobCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchJobCheckResponse self = new BatchJobCheckResponse();
        return TeaModel.build(map, self);
    }

    public BatchJobCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchJobCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchJobCheckResponse setBody(BatchJobCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchJobCheckResponseBody getBody() {
        return this.body;
    }

}
