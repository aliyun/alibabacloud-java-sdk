// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCacheRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCacheRuleResponseBody body;

    public static UpdateCacheRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCacheRuleResponse self = new UpdateCacheRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCacheRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCacheRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCacheRuleResponse setBody(UpdateCacheRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCacheRuleResponseBody getBody() {
        return this.body;
    }

}
