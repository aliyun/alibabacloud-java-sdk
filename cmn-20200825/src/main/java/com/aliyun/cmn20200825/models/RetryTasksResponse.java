// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class RetryTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryTasksResponseBody body;

    public static RetryTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryTasksResponse self = new RetryTasksResponse();
        return TeaModel.build(map, self);
    }

    public RetryTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryTasksResponse setBody(RetryTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryTasksResponseBody getBody() {
        return this.body;
    }

}
