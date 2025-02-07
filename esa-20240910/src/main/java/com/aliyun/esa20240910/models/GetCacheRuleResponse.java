// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCacheRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCacheRuleResponseBody body;

    public static GetCacheRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCacheRuleResponse self = new GetCacheRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetCacheRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCacheRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCacheRuleResponse setBody(GetCacheRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCacheRuleResponseBody getBody() {
        return this.body;
    }

}
