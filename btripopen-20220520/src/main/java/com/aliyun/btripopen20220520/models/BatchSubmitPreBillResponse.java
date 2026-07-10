// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class BatchSubmitPreBillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchSubmitPreBillResponseBody body;

    public static BatchSubmitPreBillResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSubmitPreBillResponse self = new BatchSubmitPreBillResponse();
        return TeaModel.build(map, self);
    }

    public BatchSubmitPreBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSubmitPreBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSubmitPreBillResponse setBody(BatchSubmitPreBillResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSubmitPreBillResponseBody getBody() {
        return this.body;
    }

}
