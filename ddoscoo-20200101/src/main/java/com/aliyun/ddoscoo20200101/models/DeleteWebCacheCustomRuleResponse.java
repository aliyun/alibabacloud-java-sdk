// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteWebCacheCustomRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteWebCacheCustomRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWebCacheCustomRuleResponse setBody(DeleteWebCacheCustomRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWebCacheCustomRuleResponseBody getBody() {
        return this.body;
    }

}
