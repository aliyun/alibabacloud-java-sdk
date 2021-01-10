// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryVideoSplitJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryVideoSplitJobListResponseBody body;

    public static QueryVideoSplitJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoSplitJobListResponse self = new QueryVideoSplitJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryVideoSplitJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVideoSplitJobListResponse setBody(QueryVideoSplitJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVideoSplitJobListResponseBody getBody() {
        return this.body;
    }

}
