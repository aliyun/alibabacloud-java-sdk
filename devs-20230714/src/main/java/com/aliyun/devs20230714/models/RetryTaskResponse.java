// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class RetryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Task body;

    public static RetryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryTaskResponse self = new RetryTaskResponse();
        return TeaModel.build(map, self);
    }

    public RetryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryTaskResponse setBody(Task body) {
        this.body = body;
        return this;
    }
    public Task getBody() {
        return this.body;
    }

}
