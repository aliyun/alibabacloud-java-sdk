// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryFailingReasonListForQualificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFailingReasonListForQualificationResponseBody body;

    public static QueryFailingReasonListForQualificationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFailingReasonListForQualificationResponse self = new QueryFailingReasonListForQualificationResponse();
        return TeaModel.build(map, self);
    }

    public QueryFailingReasonListForQualificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFailingReasonListForQualificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFailingReasonListForQualificationResponse setBody(QueryFailingReasonListForQualificationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFailingReasonListForQualificationResponseBody getBody() {
        return this.body;
    }

}
