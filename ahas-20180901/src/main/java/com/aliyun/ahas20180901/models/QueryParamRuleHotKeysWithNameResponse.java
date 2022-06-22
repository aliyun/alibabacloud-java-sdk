// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryParamRuleHotKeysWithNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryParamRuleHotKeysWithNameResponseBody body;

    public static QueryParamRuleHotKeysWithNameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryParamRuleHotKeysWithNameResponse self = new QueryParamRuleHotKeysWithNameResponse();
        return TeaModel.build(map, self);
    }

    public QueryParamRuleHotKeysWithNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryParamRuleHotKeysWithNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryParamRuleHotKeysWithNameResponse setBody(QueryParamRuleHotKeysWithNameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryParamRuleHotKeysWithNameResponseBody getBody() {
        return this.body;
    }

}
