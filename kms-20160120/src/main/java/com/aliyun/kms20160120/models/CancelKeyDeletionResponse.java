// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CancelKeyDeletionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelKeyDeletionResponseBody body;

    public static CancelKeyDeletionResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelKeyDeletionResponse self = new CancelKeyDeletionResponse();
        return TeaModel.build(map, self);
    }

    public CancelKeyDeletionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelKeyDeletionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelKeyDeletionResponse setBody(CancelKeyDeletionResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelKeyDeletionResponseBody getBody() {
        return this.body;
    }

}
