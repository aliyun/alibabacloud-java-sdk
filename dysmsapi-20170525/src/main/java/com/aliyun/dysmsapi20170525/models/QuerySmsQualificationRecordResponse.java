// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsQualificationRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsQualificationRecordResponseBody body;

    public static QuerySmsQualificationRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsQualificationRecordResponse self = new QuerySmsQualificationRecordResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsQualificationRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsQualificationRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsQualificationRecordResponse setBody(QuerySmsQualificationRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsQualificationRecordResponseBody getBody() {
        return this.body;
    }

}
