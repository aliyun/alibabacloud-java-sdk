// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class LogoutDeveloperResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LogoutDeveloperResponseBody body;

    public static LogoutDeveloperResponse build(java.util.Map<String, ?> map) throws Exception {
        LogoutDeveloperResponse self = new LogoutDeveloperResponse();
        return TeaModel.build(map, self);
    }

    public LogoutDeveloperResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LogoutDeveloperResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LogoutDeveloperResponse setBody(LogoutDeveloperResponseBody body) {
        this.body = body;
        return this;
    }
    public LogoutDeveloperResponseBody getBody() {
        return this.body;
    }

}
