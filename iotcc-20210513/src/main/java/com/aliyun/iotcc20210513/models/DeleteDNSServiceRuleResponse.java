// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteDNSServiceRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDNSServiceRuleResponseBody body;

    public static DeleteDNSServiceRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDNSServiceRuleResponse self = new DeleteDNSServiceRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDNSServiceRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDNSServiceRuleResponse setBody(DeleteDNSServiceRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDNSServiceRuleResponseBody getBody() {
        return this.body;
    }

}
