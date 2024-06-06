// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class IsCompletedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IsCompletedResponseBody body;

    public static IsCompletedResponse build(java.util.Map<String, ?> map) throws Exception {
        IsCompletedResponse self = new IsCompletedResponse();
        return TeaModel.build(map, self);
    }

    public IsCompletedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IsCompletedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IsCompletedResponse setBody(IsCompletedResponseBody body) {
        this.body = body;
        return this;
    }
    public IsCompletedResponseBody getBody() {
        return this.body;
    }

}
