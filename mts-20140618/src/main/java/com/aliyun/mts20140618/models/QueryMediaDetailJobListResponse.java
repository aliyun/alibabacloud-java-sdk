// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaDetailJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMediaDetailJobListResponseBody body;

    public static QueryMediaDetailJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaDetailJobListResponse self = new QueryMediaDetailJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMediaDetailJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMediaDetailJobListResponse setBody(QueryMediaDetailJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMediaDetailJobListResponseBody getBody() {
        return this.body;
    }

}
