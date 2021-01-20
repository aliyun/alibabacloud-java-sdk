// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateGroupMetricRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGroupMetricRulesResponseBody body;

    public static CreateGroupMetricRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupMetricRulesResponse self = new CreateGroupMetricRulesResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupMetricRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupMetricRulesResponse setBody(CreateGroupMetricRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupMetricRulesResponseBody getBody() {
        return this.body;
    }

}
