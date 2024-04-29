// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateWebCCRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWebCCRuleResponseBody body;

    public static CreateWebCCRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWebCCRuleResponse self = new CreateWebCCRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateWebCCRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWebCCRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWebCCRuleResponse setBody(CreateWebCCRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWebCCRuleResponseBody getBody() {
        return this.body;
    }

}
