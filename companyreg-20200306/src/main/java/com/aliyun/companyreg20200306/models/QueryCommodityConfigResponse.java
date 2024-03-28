// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryCommodityConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCommodityConfigResponseBody body;

    public static QueryCommodityConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCommodityConfigResponse self = new QueryCommodityConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryCommodityConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCommodityConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCommodityConfigResponse setBody(QueryCommodityConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCommodityConfigResponseBody getBody() {
        return this.body;
    }

}
