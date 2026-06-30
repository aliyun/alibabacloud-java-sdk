// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalGuardWsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MultiModalGuardWsResponseBody body;

    public static MultiModalGuardWsResponse build(java.util.Map<String, ?> map) throws Exception {
        MultiModalGuardWsResponse self = new MultiModalGuardWsResponse();
        return TeaModel.build(map, self);
    }

    public MultiModalGuardWsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MultiModalGuardWsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MultiModalGuardWsResponse setBody(MultiModalGuardWsResponseBody body) {
        this.body = body;
        return this;
    }
    public MultiModalGuardWsResponseBody getBody() {
        return this.body;
    }

}
