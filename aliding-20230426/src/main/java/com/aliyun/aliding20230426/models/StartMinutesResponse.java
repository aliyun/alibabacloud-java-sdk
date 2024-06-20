// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StartMinutesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartMinutesResponseBody body;

    public static StartMinutesResponse build(java.util.Map<String, ?> map) throws Exception {
        StartMinutesResponse self = new StartMinutesResponse();
        return TeaModel.build(map, self);
    }

    public StartMinutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartMinutesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartMinutesResponse setBody(StartMinutesResponseBody body) {
        this.body = body;
        return this;
    }
    public StartMinutesResponseBody getBody() {
        return this.body;
    }

}
