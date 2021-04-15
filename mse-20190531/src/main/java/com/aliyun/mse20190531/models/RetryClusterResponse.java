// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class RetryClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryClusterResponseBody body;

    public static RetryClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryClusterResponse self = new RetryClusterResponse();
        return TeaModel.build(map, self);
    }

    public RetryClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryClusterResponse setBody(RetryClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryClusterResponseBody getBody() {
        return this.body;
    }

}
