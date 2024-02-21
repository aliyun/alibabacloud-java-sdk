// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RestartLogstashResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartLogstashResponseBody body;

    public static RestartLogstashResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartLogstashResponse self = new RestartLogstashResponse();
        return TeaModel.build(map, self);
    }

    public RestartLogstashResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartLogstashResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartLogstashResponse setBody(RestartLogstashResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartLogstashResponseBody getBody() {
        return this.body;
    }

}
