// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeletePerformanceViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePerformanceViewResponseBody body;

    public static DeletePerformanceViewResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePerformanceViewResponse self = new DeletePerformanceViewResponse();
        return TeaModel.build(map, self);
    }

    public DeletePerformanceViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePerformanceViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePerformanceViewResponse setBody(DeletePerformanceViewResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePerformanceViewResponseBody getBody() {
        return this.body;
    }

}
