// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CancelJobRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelJobRunResponseBody body;

    public static CancelJobRunResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelJobRunResponse self = new CancelJobRunResponse();
        return TeaModel.build(map, self);
    }

    public CancelJobRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelJobRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelJobRunResponse setBody(CancelJobRunResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelJobRunResponseBody getBody() {
        return this.body;
    }

}
