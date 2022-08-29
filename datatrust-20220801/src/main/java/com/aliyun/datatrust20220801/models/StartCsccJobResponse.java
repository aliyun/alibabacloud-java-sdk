// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class StartCsccJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartCsccJobResponseBody body;

    public static StartCsccJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StartCsccJobResponse self = new StartCsccJobResponse();
        return TeaModel.build(map, self);
    }

    public StartCsccJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartCsccJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartCsccJobResponse setBody(StartCsccJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StartCsccJobResponseBody getBody() {
        return this.body;
    }

}
