// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryQualificationDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryQualificationDetailResponseBody body;

    public static QueryQualificationDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQualificationDetailResponse self = new QueryQualificationDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryQualificationDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryQualificationDetailResponse setBody(QueryQualificationDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryQualificationDetailResponseBody getBody() {
        return this.body;
    }

}
