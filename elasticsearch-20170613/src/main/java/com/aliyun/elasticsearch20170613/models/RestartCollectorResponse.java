// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RestartCollectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartCollectorResponseBody body;

    public static RestartCollectorResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartCollectorResponse self = new RestartCollectorResponse();
        return TeaModel.build(map, self);
    }

    public RestartCollectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartCollectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartCollectorResponse setBody(RestartCollectorResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartCollectorResponseBody getBody() {
        return this.body;
    }

}
