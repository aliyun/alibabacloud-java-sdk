// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryQualificationAuditDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryQualificationAuditDetailResponseBody body;

    public static QueryQualificationAuditDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQualificationAuditDetailResponse self = new QueryQualificationAuditDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryQualificationAuditDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryQualificationAuditDetailResponse setBody(QueryQualificationAuditDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryQualificationAuditDetailResponseBody getBody() {
        return this.body;
    }

}
