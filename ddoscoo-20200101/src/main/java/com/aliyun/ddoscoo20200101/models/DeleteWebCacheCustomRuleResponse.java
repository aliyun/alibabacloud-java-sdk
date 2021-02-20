// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteWebCacheCustomRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWebCacheCustomRuleResponseBody body;

    public static DeleteWebCacheCustomRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebCacheCustomRuleResponse self = new DeleteWebCacheCustomRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWebCacheCustomRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWebCacheCustomRuleResponse setBody(DeleteWebCacheCustomRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWebCacheCustomRuleResponseBody getBody() {
        return this.body;
    }

}
