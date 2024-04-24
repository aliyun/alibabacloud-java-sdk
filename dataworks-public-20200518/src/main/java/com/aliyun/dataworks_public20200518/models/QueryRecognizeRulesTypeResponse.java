// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryRecognizeRulesTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRecognizeRulesTypeResponseBody body;

    public static QueryRecognizeRulesTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecognizeRulesTypeResponse self = new QueryRecognizeRulesTypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecognizeRulesTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecognizeRulesTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRecognizeRulesTypeResponse setBody(QueryRecognizeRulesTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecognizeRulesTypeResponseBody getBody() {
        return this.body;
    }

}
