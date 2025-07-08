// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardSmsStatisticsSendListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCardSmsStatisticsSendListResponseBody body;

    public static QueryCardSmsStatisticsSendListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsStatisticsSendListResponse self = new QueryCardSmsStatisticsSendListResponse();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsStatisticsSendListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCardSmsStatisticsSendListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCardSmsStatisticsSendListResponse setBody(QueryCardSmsStatisticsSendListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCardSmsStatisticsSendListResponseBody getBody() {
        return this.body;
    }

}
