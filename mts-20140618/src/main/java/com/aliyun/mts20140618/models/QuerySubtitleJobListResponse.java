// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QuerySubtitleJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySubtitleJobListResponseBody body;

    public static QuerySubtitleJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySubtitleJobListResponse self = new QuerySubtitleJobListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySubtitleJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySubtitleJobListResponse setBody(QuerySubtitleJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySubtitleJobListResponseBody getBody() {
        return this.body;
    }

}
