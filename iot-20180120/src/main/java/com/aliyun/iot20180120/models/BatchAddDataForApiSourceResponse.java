// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchAddDataForApiSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchAddDataForApiSourceResponseBody body;

    public static BatchAddDataForApiSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchAddDataForApiSourceResponse self = new BatchAddDataForApiSourceResponse();
        return TeaModel.build(map, self);
    }

    public BatchAddDataForApiSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAddDataForApiSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchAddDataForApiSourceResponse setBody(BatchAddDataForApiSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAddDataForApiSourceResponseBody getBody() {
        return this.body;
    }

}
