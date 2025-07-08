// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardSmsStatisticsSendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCardSmsStatisticsSendResponseBody body;

    public static QueryCardSmsStatisticsSendResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsStatisticsSendResponse self = new QueryCardSmsStatisticsSendResponse();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsStatisticsSendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCardSmsStatisticsSendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCardSmsStatisticsSendResponse setBody(QueryCardSmsStatisticsSendResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCardSmsStatisticsSendResponseBody getBody() {
        return this.body;
    }

}
