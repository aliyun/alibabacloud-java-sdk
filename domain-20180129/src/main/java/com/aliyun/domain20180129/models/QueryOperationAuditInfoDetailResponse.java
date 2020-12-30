// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryOperationAuditInfoDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryOperationAuditInfoDetailResponse setBody(QueryOperationAuditInfoDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOperationAuditInfoDetailResponseBody getBody() {
        return this.body;
    }

}
