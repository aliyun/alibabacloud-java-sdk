// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class BatchEventRebootInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchEventRebootInstanceResponseBody body;

    public static BatchEventRebootInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchEventRebootInstanceResponse self = new BatchEventRebootInstanceResponse();
        return TeaModel.build(map, self);
    }

    public BatchEventRebootInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchEventRebootInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchEventRebootInstanceResponse setBody(BatchEventRebootInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchEventRebootInstanceResponseBody getBody() {
        return this.body;
    }

}
