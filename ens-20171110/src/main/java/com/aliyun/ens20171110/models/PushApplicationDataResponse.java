// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PushApplicationDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushApplicationDataResponseBody body;

    public static PushApplicationDataResponse build(java.util.Map<String, ?> map) throws Exception {
        PushApplicationDataResponse self = new PushApplicationDataResponse();
        return TeaModel.build(map, self);
    }

    public PushApplicationDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushApplicationDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushApplicationDataResponse setBody(PushApplicationDataResponseBody body) {
        this.body = body;
        return this;
    }
    public PushApplicationDataResponseBody getBody() {
        return this.body;
    }

}
