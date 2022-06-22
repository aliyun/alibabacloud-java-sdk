// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryParamRuleHotKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryParamRuleHotKeysResponseBody body;

    public static QueryParamRuleHotKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryParamRuleHotKeysResponse self = new QueryParamRuleHotKeysResponse();
        return TeaModel.build(map, self);
    }

    public QueryParamRuleHotKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryParamRuleHotKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryParamRuleHotKeysResponse setBody(QueryParamRuleHotKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryParamRuleHotKeysResponseBody getBody() {
        return this.body;
    }

}
