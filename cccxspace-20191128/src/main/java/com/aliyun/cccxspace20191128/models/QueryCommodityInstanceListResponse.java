// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class QueryCommodityInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCommodityInstanceListResponseBody body;

    public static QueryCommodityInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCommodityInstanceListResponse self = new QueryCommodityInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryCommodityInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCommodityInstanceListResponse setBody(QueryCommodityInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCommodityInstanceListResponseBody getBody() {
        return this.body;
    }

}
