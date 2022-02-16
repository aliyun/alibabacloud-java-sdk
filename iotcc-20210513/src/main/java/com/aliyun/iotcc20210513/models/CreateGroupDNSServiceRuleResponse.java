// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateGroupDNSServiceRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGroupDNSServiceRuleResponseBody body;

    public static CreateGroupDNSServiceRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupDNSServiceRuleResponse self = new CreateGroupDNSServiceRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupDNSServiceRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupDNSServiceRuleResponse setBody(CreateGroupDNSServiceRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupDNSServiceRuleResponseBody getBody() {
        return this.body;
    }

}
