// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RevokeAtiAgentRegisterInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeAtiAgentRegisterInfoResponseBody body;

    public static RevokeAtiAgentRegisterInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeAtiAgentRegisterInfoResponse self = new RevokeAtiAgentRegisterInfoResponse();
        return TeaModel.build(map, self);
    }

    public RevokeAtiAgentRegisterInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeAtiAgentRegisterInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeAtiAgentRegisterInfoResponse setBody(RevokeAtiAgentRegisterInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeAtiAgentRegisterInfoResponseBody getBody() {
        return this.body;
    }

}
