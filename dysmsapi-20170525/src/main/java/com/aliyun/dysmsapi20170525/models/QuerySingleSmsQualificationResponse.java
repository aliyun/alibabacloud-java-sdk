// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySingleSmsQualificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySingleSmsQualificationResponseBody body;

    public static QuerySingleSmsQualificationResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySingleSmsQualificationResponse self = new QuerySingleSmsQualificationResponse();
        return TeaModel.build(map, self);
    }

    public QuerySingleSmsQualificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySingleSmsQualificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySingleSmsQualificationResponse setBody(QuerySingleSmsQualificationResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySingleSmsQualificationResponseBody getBody() {
        return this.body;
    }

}
