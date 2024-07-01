// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreatePerformanceViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePerformanceViewResponseBody body;

    public static CreatePerformanceViewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePerformanceViewResponse self = new CreatePerformanceViewResponse();
        return TeaModel.build(map, self);
    }

    public CreatePerformanceViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePerformanceViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePerformanceViewResponse setBody(CreatePerformanceViewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePerformanceViewResponseBody getBody() {
        return this.body;
    }

}
