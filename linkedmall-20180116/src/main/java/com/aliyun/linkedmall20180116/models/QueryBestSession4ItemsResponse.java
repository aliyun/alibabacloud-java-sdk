// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBestSession4ItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBestSession4ItemsResponseBody body;

    public static QueryBestSession4ItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBestSession4ItemsResponse self = new QueryBestSession4ItemsResponse();
        return TeaModel.build(map, self);
    }

    public QueryBestSession4ItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBestSession4ItemsResponse setBody(QueryBestSession4ItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBestSession4ItemsResponseBody getBody() {
        return this.body;
    }

}
