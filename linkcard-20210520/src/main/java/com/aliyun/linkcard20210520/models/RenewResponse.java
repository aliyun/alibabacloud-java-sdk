// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class RenewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewResponseBody body;

    public static RenewResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewResponse self = new RenewResponse();
        return TeaModel.build(map, self);
    }

    public RenewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewResponse setBody(RenewResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewResponseBody getBody() {
        return this.body;
    }

}
