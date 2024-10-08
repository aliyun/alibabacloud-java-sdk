// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchCreateRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCreateRecordsResponseBody body;

    public static BatchCreateRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateRecordsResponse self = new BatchCreateRecordsResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateRecordsResponse setBody(BatchCreateRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateRecordsResponseBody getBody() {
        return this.body;
    }

}
