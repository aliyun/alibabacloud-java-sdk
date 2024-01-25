// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutResourceWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutResourceWhitelistResponseBody body;

    public static PutResourceWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        PutResourceWhitelistResponse self = new PutResourceWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public PutResourceWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutResourceWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutResourceWhitelistResponse setBody(PutResourceWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public PutResourceWhitelistResponseBody getBody() {
        return this.body;
    }

}
