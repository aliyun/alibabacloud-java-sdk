// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewDesktopsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewDesktopsResponseBody body;

    public static RenewDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewDesktopsResponse self = new RenewDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public RenewDesktopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewDesktopsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewDesktopsResponse setBody(RenewDesktopsResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewDesktopsResponseBody getBody() {
        return this.body;
    }

}
