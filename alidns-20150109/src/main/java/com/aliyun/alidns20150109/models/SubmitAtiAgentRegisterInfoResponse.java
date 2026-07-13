// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SubmitAtiAgentRegisterInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAtiAgentRegisterInfoResponseBody body;

    public static SubmitAtiAgentRegisterInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAtiAgentRegisterInfoResponse self = new SubmitAtiAgentRegisterInfoResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAtiAgentRegisterInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAtiAgentRegisterInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAtiAgentRegisterInfoResponse setBody(SubmitAtiAgentRegisterInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAtiAgentRegisterInfoResponseBody getBody() {
        return this.body;
    }

}
