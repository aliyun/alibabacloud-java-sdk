// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySaasRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySaasRecordResponseBody body;

    public static QuerySaasRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySaasRecordResponse self = new QuerySaasRecordResponse();
        return TeaModel.build(map, self);
    }

    public QuerySaasRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySaasRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySaasRecordResponse setBody(QuerySaasRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySaasRecordResponseBody getBody() {
        return this.body;
    }

}
