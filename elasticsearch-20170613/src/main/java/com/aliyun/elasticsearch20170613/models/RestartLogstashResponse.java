// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RestartLogstashResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RestartLogstashResponse setBody(RestartLogstashResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartLogstashResponseBody getBody() {
        return this.body;
    }

}
