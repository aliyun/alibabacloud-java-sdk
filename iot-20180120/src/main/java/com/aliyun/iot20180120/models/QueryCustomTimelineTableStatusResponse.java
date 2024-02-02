// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryCustomTimelineTableStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCustomTimelineTableStatusResponseBody body;

    public static QueryCustomTimelineTableStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomTimelineTableStatusResponse self = new QueryCustomTimelineTableStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryCustomTimelineTableStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCustomTimelineTableStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCustomTimelineTableStatusResponse setBody(QueryCustomTimelineTableStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCustomTimelineTableStatusResponseBody getBody() {
        return this.body;
    }

}
