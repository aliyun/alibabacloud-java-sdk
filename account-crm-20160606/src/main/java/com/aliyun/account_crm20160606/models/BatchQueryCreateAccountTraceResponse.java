// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class BatchQueryCreateAccountTraceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchQueryCreateAccountTraceResponseBody body;

    public static BatchQueryCreateAccountTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryCreateAccountTraceResponse self = new BatchQueryCreateAccountTraceResponse();
        return TeaModel.build(map, self);
    }

    public BatchQueryCreateAccountTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchQueryCreateAccountTraceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchQueryCreateAccountTraceResponse setBody(BatchQueryCreateAccountTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchQueryCreateAccountTraceResponseBody getBody() {
        return this.body;
    }

}
