// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class InvokeShellCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvokeShellCommandResponseBody body;

    public static InvokeShellCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeShellCommandResponse self = new InvokeShellCommandResponse();
        return TeaModel.build(map, self);
    }

    public InvokeShellCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeShellCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvokeShellCommandResponse setBody(InvokeShellCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeShellCommandResponseBody getBody() {
        return this.body;
    }

}
