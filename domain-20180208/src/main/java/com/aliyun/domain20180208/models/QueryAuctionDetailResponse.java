// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryAuctionDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAuctionDetailResponseBody body;

    public static QueryAuctionDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuctionDetailResponse self = new QueryAuctionDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuctionDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAuctionDetailResponse setBody(QueryAuctionDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAuctionDetailResponseBody getBody() {
        return this.body;
    }

}
