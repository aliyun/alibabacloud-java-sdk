// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListExecutorLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExecutorLogsResponseBody body;

    public static ListExecutorLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExecutorLogsResponse self = new ListExecutorLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListExecutorLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExecutorLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExecutorLogsResponse setBody(ListExecutorLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExecutorLogsResponseBody getBody() {
        return this.body;
    }

}
