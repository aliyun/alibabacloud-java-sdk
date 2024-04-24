// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryRecognizeRuleDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRecognizeRuleDetailResponseBody body;

    public static QueryRecognizeRuleDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecognizeRuleDetailResponse self = new QueryRecognizeRuleDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecognizeRuleDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecognizeRuleDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRecognizeRuleDetailResponse setBody(QueryRecognizeRuleDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecognizeRuleDetailResponseBody getBody() {
        return this.body;
    }

}
