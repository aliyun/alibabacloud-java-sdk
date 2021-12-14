// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryQualificationListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryQualificationListResponseBody body;

    public static QueryQualificationListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQualificationListResponse self = new QueryQualificationListResponse();
        return TeaModel.build(map, self);
    }

    public QueryQualificationListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryQualificationListResponse setBody(QueryQualificationListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryQualificationListResponseBody getBody() {
        return this.body;
    }

}
