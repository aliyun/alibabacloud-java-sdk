// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateWebFilterRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWebFilterRulesResponseBody body;

    public static CreateWebFilterRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWebFilterRulesResponse self = new CreateWebFilterRulesResponse();
        return TeaModel.build(map, self);
    }

    public CreateWebFilterRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWebFilterRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWebFilterRulesResponse setBody(CreateWebFilterRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWebFilterRulesResponseBody getBody() {
        return this.body;
    }

}
