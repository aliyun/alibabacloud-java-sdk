// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateQualityRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateQualityRuleResponseBody body;

    public static CreateQualityRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityRuleResponse self = new CreateQualityRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateQualityRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQualityRuleResponse setBody(CreateQualityRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQualityRuleResponseBody getBody() {
        return this.body;
    }

}
