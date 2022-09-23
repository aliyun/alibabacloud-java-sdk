// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryWaybillOrderInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryWaybillOrderInfoResponseBody body;

    public static QueryWaybillOrderInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWaybillOrderInfoResponse self = new QueryWaybillOrderInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryWaybillOrderInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryWaybillOrderInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryWaybillOrderInfoResponse setBody(QueryWaybillOrderInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWaybillOrderInfoResponseBody getBody() {
        return this.body;
    }

}
