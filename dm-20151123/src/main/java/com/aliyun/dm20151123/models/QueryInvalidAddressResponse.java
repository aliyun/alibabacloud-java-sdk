// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryInvalidAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryInvalidAddressResponseBody body;

    public static QueryInvalidAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInvalidAddressResponse self = new QueryInvalidAddressResponse();
        return TeaModel.build(map, self);
    }

    public QueryInvalidAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInvalidAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInvalidAddressResponse setBody(QueryInvalidAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInvalidAddressResponseBody getBody() {
        return this.body;
    }

}
