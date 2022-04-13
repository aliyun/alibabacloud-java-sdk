// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryGuideItemGroupByItemStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryGuideItemGroupByItemStateResponseBody body;

    public static QueryGuideItemGroupByItemStateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGuideItemGroupByItemStateResponse self = new QueryGuideItemGroupByItemStateResponse();
        return TeaModel.build(map, self);
    }

    public QueryGuideItemGroupByItemStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGuideItemGroupByItemStateResponse setBody(QueryGuideItemGroupByItemStateResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGuideItemGroupByItemStateResponseBody getBody() {
        return this.body;
    }

}
