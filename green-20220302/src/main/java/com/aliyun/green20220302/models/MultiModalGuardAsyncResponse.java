// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalGuardAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MultiModalGuardAsyncResponseBody body;

    public static MultiModalGuardAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        MultiModalGuardAsyncResponse self = new MultiModalGuardAsyncResponse();
        return TeaModel.build(map, self);
    }

    public MultiModalGuardAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MultiModalGuardAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MultiModalGuardAsyncResponse setBody(MultiModalGuardAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public MultiModalGuardAsyncResponseBody getBody() {
        return this.body;
    }

}
