// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateBuildRecordByRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBuildRecordByRuleResponseBody body;

    public static CreateBuildRecordByRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBuildRecordByRuleResponse self = new CreateBuildRecordByRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateBuildRecordByRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBuildRecordByRuleResponse setBody(CreateBuildRecordByRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBuildRecordByRuleResponseBody getBody() {
        return this.body;
    }

}
