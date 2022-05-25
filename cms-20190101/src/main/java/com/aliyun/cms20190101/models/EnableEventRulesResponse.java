// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableEventRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableEventRulesResponseBody body;

    public static EnableEventRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableEventRulesResponse self = new EnableEventRulesResponse();
        return TeaModel.build(map, self);
    }

    public EnableEventRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableEventRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableEventRulesResponse setBody(EnableEventRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableEventRulesResponseBody getBody() {
        return this.body;
    }

}
