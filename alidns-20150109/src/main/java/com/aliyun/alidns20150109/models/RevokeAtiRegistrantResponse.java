// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RevokeAtiRegistrantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeAtiRegistrantResponseBody body;

    public static RevokeAtiRegistrantResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeAtiRegistrantResponse self = new RevokeAtiRegistrantResponse();
        return TeaModel.build(map, self);
    }

    public RevokeAtiRegistrantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeAtiRegistrantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeAtiRegistrantResponse setBody(RevokeAtiRegistrantResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeAtiRegistrantResponseBody getBody() {
        return this.body;
    }

}
