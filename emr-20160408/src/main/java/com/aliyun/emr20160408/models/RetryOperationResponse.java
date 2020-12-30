// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class RetryOperationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryOperationResponseBody body;

    public static RetryOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryOperationResponse self = new RetryOperationResponse();
        return TeaModel.build(map, self);
    }

    public RetryOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryOperationResponse setBody(RetryOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryOperationResponseBody getBody() {
        return this.body;
    }

}
