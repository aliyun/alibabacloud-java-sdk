// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTopicReverseRouteTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTopicReverseRouteTableResponseBody body;

    public static QueryTopicReverseRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopicReverseRouteTableResponse self = new QueryTopicReverseRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopicReverseRouteTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopicReverseRouteTableResponse setBody(QueryTopicReverseRouteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopicReverseRouteTableResponseBody getBody() {
        return this.body;
    }

}
