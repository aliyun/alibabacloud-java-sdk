// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class StartBackToBackCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartBackToBackCallResponseBody body;

    public static StartBackToBackCallResponse build(java.util.Map<String, ?> map) throws Exception {
        StartBackToBackCallResponse self = new StartBackToBackCallResponse();
        return TeaModel.build(map, self);
    }

    public StartBackToBackCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartBackToBackCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartBackToBackCallResponse setBody(StartBackToBackCallResponseBody body) {
        this.body = body;
        return this;
    }
    public StartBackToBackCallResponseBody getBody() {
        return this.body;
    }

}
