// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QuerySmarttagJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySmarttagJobListResponseBody body;

    public static QuerySmarttagJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmarttagJobListResponse self = new QuerySmarttagJobListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmarttagJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmarttagJobListResponse setBody(QuerySmarttagJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmarttagJobListResponseBody getBody() {
        return this.body;
    }

}
