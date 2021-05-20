// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateQualityRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateQualityRuleResponseBody body;

    public static UpdateQualityRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityRuleResponse self = new UpdateQualityRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateQualityRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateQualityRuleResponse setBody(UpdateQualityRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQualityRuleResponseBody getBody() {
        return this.body;
    }

}
