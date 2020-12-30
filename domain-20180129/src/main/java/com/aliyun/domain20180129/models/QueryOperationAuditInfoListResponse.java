// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryOperationAuditInfoListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryOperationAuditInfoListResponse setBody(QueryOperationAuditInfoListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOperationAuditInfoListResponseBody getBody() {
        return this.body;
    }

}
