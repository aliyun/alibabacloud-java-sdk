// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CorpTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CorpTokenResponseBody body;

    public static CorpTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CorpTokenResponse self = new CorpTokenResponse();
        return TeaModel.build(map, self);
    }

    public CorpTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CorpTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CorpTokenResponse setBody(CorpTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CorpTokenResponseBody getBody() {
        return this.body;
    }

}
