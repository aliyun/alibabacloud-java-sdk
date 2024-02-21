// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CancelLogstashDeletionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelLogstashDeletionResponseBody body;

    public static CancelLogstashDeletionResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelLogstashDeletionResponse self = new CancelLogstashDeletionResponse();
        return TeaModel.build(map, self);
    }

    public CancelLogstashDeletionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelLogstashDeletionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelLogstashDeletionResponse setBody(CancelLogstashDeletionResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelLogstashDeletionResponseBody getBody() {
        return this.body;
    }

}
