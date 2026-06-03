// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryCommonStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCommonStatisticResponseBody body;

    public static QueryCommonStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCommonStatisticResponse self = new QueryCommonStatisticResponse();
        return TeaModel.build(map, self);
    }

    public QueryCommonStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCommonStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCommonStatisticResponse setBody(QueryCommonStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCommonStatisticResponseBody getBody() {
        return this.body;
    }

}
