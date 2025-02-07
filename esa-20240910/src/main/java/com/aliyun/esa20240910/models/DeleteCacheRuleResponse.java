// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteCacheRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCacheRuleResponseBody body;

    public static DeleteCacheRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCacheRuleResponse self = new DeleteCacheRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCacheRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCacheRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCacheRuleResponse setBody(DeleteCacheRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCacheRuleResponseBody getBody() {
        return this.body;
    }

}
