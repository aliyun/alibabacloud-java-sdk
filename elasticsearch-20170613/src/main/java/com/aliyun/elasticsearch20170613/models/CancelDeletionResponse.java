// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CancelDeletionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelDeletionResponseBody body;

    public static CancelDeletionResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelDeletionResponse self = new CancelDeletionResponse();
        return TeaModel.build(map, self);
    }

    public CancelDeletionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelDeletionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelDeletionResponse setBody(CancelDeletionResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelDeletionResponseBody getBody() {
        return this.body;
    }

}
