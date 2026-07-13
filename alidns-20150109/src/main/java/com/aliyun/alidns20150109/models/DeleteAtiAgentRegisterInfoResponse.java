// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteAtiAgentRegisterInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAtiAgentRegisterInfoResponseBody body;

    public static DeleteAtiAgentRegisterInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAtiAgentRegisterInfoResponse self = new DeleteAtiAgentRegisterInfoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAtiAgentRegisterInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAtiAgentRegisterInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAtiAgentRegisterInfoResponse setBody(DeleteAtiAgentRegisterInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAtiAgentRegisterInfoResponseBody getBody() {
        return this.body;
    }

}
