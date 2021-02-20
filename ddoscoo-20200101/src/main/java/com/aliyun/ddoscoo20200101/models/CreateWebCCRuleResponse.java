// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateWebCCRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateWebCCRuleResponse setBody(CreateWebCCRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWebCCRuleResponseBody getBody() {
        return this.body;
    }

}
