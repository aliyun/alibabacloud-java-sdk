// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteWebCCRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWebCCRuleResponseBody body;

    public static DeleteWebCCRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebCCRuleResponse self = new DeleteWebCCRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWebCCRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWebCCRuleResponse setBody(DeleteWebCCRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWebCCRuleResponseBody getBody() {
        return this.body;
    }

}
