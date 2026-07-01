// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateRCSMobileCapableTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRCSMobileCapableTaskResponseBody body;

    public static CreateRCSMobileCapableTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRCSMobileCapableTaskResponse self = new CreateRCSMobileCapableTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateRCSMobileCapableTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRCSMobileCapableTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRCSMobileCapableTaskResponse setBody(CreateRCSMobileCapableTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRCSMobileCapableTaskResponseBody getBody() {
        return this.body;
    }

}
