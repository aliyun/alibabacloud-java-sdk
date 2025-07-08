// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardSmsHistoryDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCardSmsHistoryDetailResponseBody body;

    public static QueryCardSmsHistoryDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsHistoryDetailResponse self = new QueryCardSmsHistoryDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsHistoryDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCardSmsHistoryDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCardSmsHistoryDetailResponse setBody(QueryCardSmsHistoryDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCardSmsHistoryDetailResponseBody getBody() {
        return this.body;
    }

}
