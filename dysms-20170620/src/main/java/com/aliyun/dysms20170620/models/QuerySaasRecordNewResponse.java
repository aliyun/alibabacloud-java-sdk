// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySaasRecordNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySaasRecordNewResponseBody body;

    public static QuerySaasRecordNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySaasRecordNewResponse self = new QuerySaasRecordNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySaasRecordNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySaasRecordNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySaasRecordNewResponse setBody(QuerySaasRecordNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySaasRecordNewResponseBody getBody() {
        return this.body;
    }

}
