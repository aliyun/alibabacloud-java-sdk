// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class InitAppFailOverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitAppFailOverResponseBody body;

    public static InitAppFailOverResponse build(java.util.Map<String, ?> map) throws Exception {
        InitAppFailOverResponse self = new InitAppFailOverResponse();
        return TeaModel.build(map, self);
    }

    public InitAppFailOverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitAppFailOverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitAppFailOverResponse setBody(InitAppFailOverResponseBody body) {
        this.body = body;
        return this;
    }
    public InitAppFailOverResponseBody getBody() {
        return this.body;
    }

}
