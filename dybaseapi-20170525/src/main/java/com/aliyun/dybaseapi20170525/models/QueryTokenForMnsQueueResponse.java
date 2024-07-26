// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dybaseapi20170525.models;

import com.aliyun.tea.*;

public class QueryTokenForMnsQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTokenForMnsQueueResponseBody body;

    public static QueryTokenForMnsQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTokenForMnsQueueResponse self = new QueryTokenForMnsQueueResponse();
        return TeaModel.build(map, self);
    }

    public QueryTokenForMnsQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTokenForMnsQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTokenForMnsQueueResponse setBody(QueryTokenForMnsQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTokenForMnsQueueResponseBody getBody() {
        return this.body;
    }

}
