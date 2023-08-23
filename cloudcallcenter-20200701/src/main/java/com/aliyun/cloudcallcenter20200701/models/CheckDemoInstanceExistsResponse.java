// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class CheckDemoInstanceExistsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckDemoInstanceExistsResponseBody body;

    public static CheckDemoInstanceExistsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDemoInstanceExistsResponse self = new CheckDemoInstanceExistsResponse();
        return TeaModel.build(map, self);
    }

    public CheckDemoInstanceExistsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDemoInstanceExistsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDemoInstanceExistsResponse setBody(CheckDemoInstanceExistsResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDemoInstanceExistsResponseBody getBody() {
        return this.body;
    }

}
