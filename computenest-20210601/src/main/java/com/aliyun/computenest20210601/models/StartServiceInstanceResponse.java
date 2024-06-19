// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class StartServiceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartServiceInstanceResponseBody body;

    public static StartServiceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartServiceInstanceResponse self = new StartServiceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartServiceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartServiceInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartServiceInstanceResponse setBody(StartServiceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartServiceInstanceResponseBody getBody() {
        return this.body;
    }

}
