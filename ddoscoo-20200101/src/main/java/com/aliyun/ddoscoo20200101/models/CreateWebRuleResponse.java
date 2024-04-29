// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateWebRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWebRuleResponseBody body;

    public static CreateWebRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWebRuleResponse self = new CreateWebRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateWebRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWebRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWebRuleResponse setBody(CreateWebRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWebRuleResponseBody getBody() {
        return this.body;
    }

}
