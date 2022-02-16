// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteGroupDNSServiceRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGroupDNSServiceRuleResponseBody body;

    public static DeleteGroupDNSServiceRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupDNSServiceRuleResponse self = new DeleteGroupDNSServiceRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGroupDNSServiceRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGroupDNSServiceRuleResponse setBody(DeleteGroupDNSServiceRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGroupDNSServiceRuleResponseBody getBody() {
        return this.body;
    }

}
