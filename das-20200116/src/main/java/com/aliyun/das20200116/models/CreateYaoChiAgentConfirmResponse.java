// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateYaoChiAgentConfirmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateYaoChiAgentConfirmResponseBody body;

    public static CreateYaoChiAgentConfirmResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateYaoChiAgentConfirmResponse self = new CreateYaoChiAgentConfirmResponse();
        return TeaModel.build(map, self);
    }

    public CreateYaoChiAgentConfirmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateYaoChiAgentConfirmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateYaoChiAgentConfirmResponse setBody(CreateYaoChiAgentConfirmResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateYaoChiAgentConfirmResponseBody getBody() {
        return this.body;
    }

}
