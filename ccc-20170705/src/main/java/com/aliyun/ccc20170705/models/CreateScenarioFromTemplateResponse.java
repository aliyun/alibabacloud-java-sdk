// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateScenarioFromTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateScenarioFromTemplateResponseBody body;

    public static CreateScenarioFromTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScenarioFromTemplateResponse self = new CreateScenarioFromTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateScenarioFromTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScenarioFromTemplateResponse setBody(CreateScenarioFromTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScenarioFromTemplateResponseBody getBody() {
        return this.body;
    }

}
