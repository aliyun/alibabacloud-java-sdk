// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RescaleApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RescaleApplicationResponseBody body;

    public static RescaleApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        RescaleApplicationResponse self = new RescaleApplicationResponse();
        return TeaModel.build(map, self);
    }

    public RescaleApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RescaleApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RescaleApplicationResponse setBody(RescaleApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public RescaleApplicationResponseBody getBody() {
        return this.body;
    }

}
