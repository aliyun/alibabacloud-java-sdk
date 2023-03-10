// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class CancelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelResponseBody body;

    public static CancelResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelResponse self = new CancelResponse();
        return TeaModel.build(map, self);
    }

    public CancelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelResponse setBody(CancelResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelResponseBody getBody() {
        return this.body;
    }

}
