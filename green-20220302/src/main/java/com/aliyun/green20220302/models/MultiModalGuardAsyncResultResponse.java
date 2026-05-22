// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalGuardAsyncResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MultiModalGuardAsyncResultResponseBody body;

    public static MultiModalGuardAsyncResultResponse build(java.util.Map<String, ?> map) throws Exception {
        MultiModalGuardAsyncResultResponse self = new MultiModalGuardAsyncResultResponse();
        return TeaModel.build(map, self);
    }

    public MultiModalGuardAsyncResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MultiModalGuardAsyncResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MultiModalGuardAsyncResultResponse setBody(MultiModalGuardAsyncResultResponseBody body) {
        this.body = body;
        return this;
    }
    public MultiModalGuardAsyncResultResponseBody getBody() {
        return this.body;
    }

}
