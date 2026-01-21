// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bsn20150512.models;

import com.aliyun.tea.*;

public class GrantBsnCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantBsnCodeResponseBody body;

    public static GrantBsnCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantBsnCodeResponse self = new GrantBsnCodeResponse();
        return TeaModel.build(map, self);
    }

    public GrantBsnCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantBsnCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantBsnCodeResponse setBody(GrantBsnCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantBsnCodeResponseBody getBody() {
        return this.body;
    }

}
