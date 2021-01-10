// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEdgeInstanceChannelResponseBody body;

    public static QueryEdgeInstanceChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceChannelResponse self = new QueryEdgeInstanceChannelResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEdgeInstanceChannelResponse setBody(QueryEdgeInstanceChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEdgeInstanceChannelResponseBody getBody() {
        return this.body;
    }

}
