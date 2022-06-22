// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryParamRulesWithNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryParamRulesWithNameResponseBody body;

    public static QueryParamRulesWithNameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryParamRulesWithNameResponse self = new QueryParamRulesWithNameResponse();
        return TeaModel.build(map, self);
    }

    public QueryParamRulesWithNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryParamRulesWithNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryParamRulesWithNameResponse setBody(QueryParamRulesWithNameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryParamRulesWithNameResponseBody getBody() {
        return this.body;
    }

}
