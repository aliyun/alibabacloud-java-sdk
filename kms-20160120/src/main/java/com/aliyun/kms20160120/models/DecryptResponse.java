// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DecryptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DecryptResponseBody body;

    public static DecryptResponse build(java.util.Map<String, ?> map) throws Exception {
        DecryptResponse self = new DecryptResponse();
        return TeaModel.build(map, self);
    }

    public DecryptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DecryptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DecryptResponse setBody(DecryptResponseBody body) {
        this.body = body;
        return this;
    }
    public DecryptResponseBody getBody() {
        return this.body;
    }

}
