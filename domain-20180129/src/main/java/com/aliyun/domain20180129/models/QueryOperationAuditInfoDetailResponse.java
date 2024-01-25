// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryOperationAuditInfoDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryOperationAuditInfoDetailResponseBody body;

    public static QueryOperationAuditInfoDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOperationAuditInfoDetailResponse self = new QueryOperationAuditInfoDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryOperationAuditInfoDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOperationAuditInfoDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOperationAuditInfoDetailResponse setBody(QueryOperationAuditInfoDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOperationAuditInfoDetailResponseBody getBody() {
        return this.body;
    }

}
