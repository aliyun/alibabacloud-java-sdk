// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RetryChangeOrderTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryChangeOrderTaskResponseBody body;

    public static RetryChangeOrderTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryChangeOrderTaskResponse self = new RetryChangeOrderTaskResponse();
        return TeaModel.build(map, self);
    }

    public RetryChangeOrderTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryChangeOrderTaskResponse setBody(RetryChangeOrderTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryChangeOrderTaskResponseBody getBody() {
        return this.body;
    }

}
