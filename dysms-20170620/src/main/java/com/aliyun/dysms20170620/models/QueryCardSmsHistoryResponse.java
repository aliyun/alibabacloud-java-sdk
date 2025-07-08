// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardSmsHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCardSmsHistoryResponseBody body;

    public static QueryCardSmsHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsHistoryResponse self = new QueryCardSmsHistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCardSmsHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCardSmsHistoryResponse setBody(QueryCardSmsHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCardSmsHistoryResponseBody getBody() {
        return this.body;
    }

}
