// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ReEncryptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReEncryptResponseBody body;

    public static ReEncryptResponse build(java.util.Map<String, ?> map) throws Exception {
        ReEncryptResponse self = new ReEncryptResponse();
        return TeaModel.build(map, self);
    }

    public ReEncryptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReEncryptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReEncryptResponse setBody(ReEncryptResponseBody body) {
        this.body = body;
        return this;
    }
    public ReEncryptResponseBody getBody() {
        return this.body;
    }

}
