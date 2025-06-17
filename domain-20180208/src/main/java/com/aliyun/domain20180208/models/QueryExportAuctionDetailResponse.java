// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryExportAuctionDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryExportAuctionDetailResponseBody body;

    public static QueryExportAuctionDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExportAuctionDetailResponse self = new QueryExportAuctionDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryExportAuctionDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExportAuctionDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExportAuctionDetailResponse setBody(QueryExportAuctionDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExportAuctionDetailResponseBody getBody() {
        return this.body;
    }

}
