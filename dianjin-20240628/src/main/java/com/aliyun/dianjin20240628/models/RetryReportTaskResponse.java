// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RetryReportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryReportTaskResponseBody body;

    public static RetryReportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryReportTaskResponse self = new RetryReportTaskResponse();
        return TeaModel.build(map, self);
    }

    public RetryReportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryReportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryReportTaskResponse setBody(RetryReportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryReportTaskResponseBody getBody() {
        return this.body;
    }

}
