// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalGuardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MultiModalGuardResponseBody body;

    public static MultiModalGuardResponse build(java.util.Map<String, ?> map) throws Exception {
        MultiModalGuardResponse self = new MultiModalGuardResponse();
        return TeaModel.build(map, self);
    }

    public MultiModalGuardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MultiModalGuardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MultiModalGuardResponse setBody(MultiModalGuardResponseBody body) {
        this.body = body;
        return this;
    }
    public MultiModalGuardResponseBody getBody() {
        return this.body;
    }

}
