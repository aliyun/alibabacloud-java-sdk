// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateAtiAgentRegisterInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAtiAgentRegisterInfoResponseBody body;

    public static CreateAtiAgentRegisterInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAtiAgentRegisterInfoResponse self = new CreateAtiAgentRegisterInfoResponse();
        return TeaModel.build(map, self);
    }

    public CreateAtiAgentRegisterInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAtiAgentRegisterInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAtiAgentRegisterInfoResponse setBody(CreateAtiAgentRegisterInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAtiAgentRegisterInfoResponseBody getBody() {
        return this.body;
    }

}
