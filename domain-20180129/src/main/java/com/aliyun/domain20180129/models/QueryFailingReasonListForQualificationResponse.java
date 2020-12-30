// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryFailingReasonListForQualificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryFailingReasonListForQualificationResponse setBody(QueryFailingReasonListForQualificationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFailingReasonListForQualificationResponseBody getBody() {
        return this.body;
    }

}
