// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderIdByPayIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOrderIdByPayIdResponseBody body;

    public static QueryOrderIdByPayIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderIdByPayIdResponse self = new QueryOrderIdByPayIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderIdByPayIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderIdByPayIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrderIdByPayIdResponse setBody(QueryOrderIdByPayIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderIdByPayIdResponseBody getBody() {
        return this.body;
    }

}
