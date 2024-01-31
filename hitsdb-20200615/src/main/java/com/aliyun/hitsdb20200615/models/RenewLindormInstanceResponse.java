// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class RenewLindormInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewLindormInstanceResponseBody body;

    public static RenewLindormInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewLindormInstanceResponse self = new RenewLindormInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RenewLindormInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewLindormInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewLindormInstanceResponse setBody(RenewLindormInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewLindormInstanceResponseBody getBody() {
        return this.body;
    }

}
