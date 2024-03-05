// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class InitializeEHPCResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitializeEHPCResponseBody body;

    public static InitializeEHPCResponse build(java.util.Map<String, ?> map) throws Exception {
        InitializeEHPCResponse self = new InitializeEHPCResponse();
        return TeaModel.build(map, self);
    }

    public InitializeEHPCResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitializeEHPCResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitializeEHPCResponse setBody(InitializeEHPCResponseBody body) {
        this.body = body;
        return this;
    }
    public InitializeEHPCResponseBody getBody() {
        return this.body;
    }

}
