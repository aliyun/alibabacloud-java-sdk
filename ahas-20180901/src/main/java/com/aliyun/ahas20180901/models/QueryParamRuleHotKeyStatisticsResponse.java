// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryParamRuleHotKeyStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryParamRuleHotKeyStatisticsResponseBody body;

    public static QueryParamRuleHotKeyStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryParamRuleHotKeyStatisticsResponse self = new QueryParamRuleHotKeyStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryParamRuleHotKeyStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryParamRuleHotKeyStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryParamRuleHotKeyStatisticsResponse setBody(QueryParamRuleHotKeyStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryParamRuleHotKeyStatisticsResponseBody getBody() {
        return this.body;
    }

}
