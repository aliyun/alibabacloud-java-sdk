// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateCacheRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCacheRuleResponseBody body;

    public static CreateCacheRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCacheRuleResponse self = new CreateCacheRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateCacheRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCacheRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCacheRuleResponse setBody(CreateCacheRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCacheRuleResponseBody getBody() {
        return this.body;
    }

}
