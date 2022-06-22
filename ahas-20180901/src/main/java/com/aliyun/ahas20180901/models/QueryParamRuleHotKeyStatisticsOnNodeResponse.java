// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryParamRuleHotKeyStatisticsOnNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryParamRuleHotKeyStatisticsOnNodeResponseBody body;

    public static QueryParamRuleHotKeyStatisticsOnNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryParamRuleHotKeyStatisticsOnNodeResponse self = new QueryParamRuleHotKeyStatisticsOnNodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryParamRuleHotKeyStatisticsOnNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryParamRuleHotKeyStatisticsOnNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryParamRuleHotKeyStatisticsOnNodeResponse setBody(QueryParamRuleHotKeyStatisticsOnNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryParamRuleHotKeyStatisticsOnNodeResponseBody getBody() {
        return this.body;
    }

}
