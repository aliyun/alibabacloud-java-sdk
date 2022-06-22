// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySentinelHotparamRuleOfResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySentinelHotparamRuleOfResourceResponseBody body;

    public static QuerySentinelHotparamRuleOfResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySentinelHotparamRuleOfResourceResponse self = new QuerySentinelHotparamRuleOfResourceResponse();
        return TeaModel.build(map, self);
    }

    public QuerySentinelHotparamRuleOfResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySentinelHotparamRuleOfResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySentinelHotparamRuleOfResourceResponse setBody(QuerySentinelHotparamRuleOfResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySentinelHotparamRuleOfResourceResponseBody getBody() {
        return this.body;
    }

}
