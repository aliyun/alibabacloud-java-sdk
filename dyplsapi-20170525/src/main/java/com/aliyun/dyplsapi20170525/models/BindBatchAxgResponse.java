// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindBatchAxgResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BindBatchAxgResponseBody body;

    public static BindBatchAxgResponse build(java.util.Map<String, ?> map) throws Exception {
        BindBatchAxgResponse self = new BindBatchAxgResponse();
        return TeaModel.build(map, self);
    }

    public BindBatchAxgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindBatchAxgResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindBatchAxgResponse setBody(BindBatchAxgResponseBody body) {
        this.body = body;
        return this;
    }
    public BindBatchAxgResponseBody getBody() {
        return this.body;
    }

}
