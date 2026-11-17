// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateApplicationCustomRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApplicationCustomRulesResponseBody body;

    public static CreateApplicationCustomRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationCustomRulesResponse self = new CreateApplicationCustomRulesResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationCustomRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicationCustomRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApplicationCustomRulesResponse setBody(CreateApplicationCustomRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicationCustomRulesResponseBody getBody() {
        return this.body;
    }

}
