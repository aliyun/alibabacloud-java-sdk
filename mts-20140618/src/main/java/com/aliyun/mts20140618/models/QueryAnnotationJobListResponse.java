// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryAnnotationJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAnnotationJobListResponseBody body;

    public static QueryAnnotationJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAnnotationJobListResponse self = new QueryAnnotationJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAnnotationJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAnnotationJobListResponse setBody(QueryAnnotationJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAnnotationJobListResponseBody getBody() {
        return this.body;
    }

}
