// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchQueryIndividuationTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchQueryIndividuationTextResponseBody body;

    public static BatchQueryIndividuationTextResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryIndividuationTextResponse self = new BatchQueryIndividuationTextResponse();
        return TeaModel.build(map, self);
    }

    public BatchQueryIndividuationTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchQueryIndividuationTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchQueryIndividuationTextResponse setBody(BatchQueryIndividuationTextResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchQueryIndividuationTextResponseBody getBody() {
        return this.body;
    }

}
