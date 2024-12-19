// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAddressResponseBody body;

    public static QueryAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAddressResponse self = new QueryAddressResponse();
        return TeaModel.build(map, self);
    }

    public QueryAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAddressResponse setBody(QueryAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAddressResponseBody getBody() {
        return this.body;
    }

}
