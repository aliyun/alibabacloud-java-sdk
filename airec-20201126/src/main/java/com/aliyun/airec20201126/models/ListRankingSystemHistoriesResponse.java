// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListRankingSystemHistoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRankingSystemHistoriesResponseBody body;

    public static ListRankingSystemHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRankingSystemHistoriesResponse self = new ListRankingSystemHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListRankingSystemHistoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRankingSystemHistoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRankingSystemHistoriesResponse setBody(ListRankingSystemHistoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRankingSystemHistoriesResponseBody getBody() {
        return this.body;
    }

}
