// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryLiveStreamingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLiveStreamingResponseBody body;

    public static QueryLiveStreamingResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveStreamingResponse self = new QueryLiveStreamingResponse();
        return TeaModel.build(map, self);
    }

    public QueryLiveStreamingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLiveStreamingResponse setBody(QueryLiveStreamingResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLiveStreamingResponseBody getBody() {
        return this.body;
    }

}
