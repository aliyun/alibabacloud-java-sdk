// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class StartDesktopsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartDesktopsResponseBody body;

    public static StartDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDesktopsResponse self = new StartDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public StartDesktopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDesktopsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDesktopsResponse setBody(StartDesktopsResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDesktopsResponseBody getBody() {
        return this.body;
    }

}
