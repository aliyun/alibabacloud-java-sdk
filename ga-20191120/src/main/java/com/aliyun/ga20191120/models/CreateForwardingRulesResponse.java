// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateForwardingRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateForwardingRulesResponseBody body;

    public static CreateForwardingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateForwardingRulesResponse self = new CreateForwardingRulesResponse();
        return TeaModel.build(map, self);
    }

    public CreateForwardingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateForwardingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateForwardingRulesResponse setBody(CreateForwardingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateForwardingRulesResponseBody getBody() {
        return this.body;
    }

}
