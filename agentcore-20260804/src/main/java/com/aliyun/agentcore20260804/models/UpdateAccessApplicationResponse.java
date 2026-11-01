// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateAccessApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAccessApplicationResponseBody body;

    public static UpdateAccessApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessApplicationResponse self = new UpdateAccessApplicationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAccessApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAccessApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAccessApplicationResponse setBody(UpdateAccessApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAccessApplicationResponseBody getBody() {
        return this.body;
    }

}
