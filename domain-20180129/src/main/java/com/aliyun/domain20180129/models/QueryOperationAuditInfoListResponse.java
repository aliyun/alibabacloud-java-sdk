// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryOperationAuditInfoListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryOperationAuditInfoListResponseBody body;

    public static QueryOperationAuditInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOperationAuditInfoListResponse self = new QueryOperationAuditInfoListResponse();
        return TeaModel.build(map, self);
    }

    public QueryOperationAuditInfoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOperationAuditInfoListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOperationAuditInfoListResponse setBody(QueryOperationAuditInfoListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOperationAuditInfoListResponseBody getBody() {
        return this.body;
    }

}
