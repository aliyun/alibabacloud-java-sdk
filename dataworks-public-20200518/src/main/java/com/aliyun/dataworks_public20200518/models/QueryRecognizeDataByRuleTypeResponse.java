// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryRecognizeDataByRuleTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRecognizeDataByRuleTypeResponseBody body;

    public static QueryRecognizeDataByRuleTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecognizeDataByRuleTypeResponse self = new QueryRecognizeDataByRuleTypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecognizeDataByRuleTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecognizeDataByRuleTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRecognizeDataByRuleTypeResponse setBody(QueryRecognizeDataByRuleTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecognizeDataByRuleTypeResponseBody getBody() {
        return this.body;
    }

}
