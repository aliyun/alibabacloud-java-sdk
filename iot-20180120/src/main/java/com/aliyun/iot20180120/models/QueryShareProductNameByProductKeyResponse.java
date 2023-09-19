// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryShareProductNameByProductKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryShareProductNameByProductKeyResponseBody body;

    public static QueryShareProductNameByProductKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryShareProductNameByProductKeyResponse self = new QueryShareProductNameByProductKeyResponse();
        return TeaModel.build(map, self);
    }

    public QueryShareProductNameByProductKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryShareProductNameByProductKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryShareProductNameByProductKeyResponse setBody(QueryShareProductNameByProductKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryShareProductNameByProductKeyResponseBody getBody() {
        return this.body;
    }

}
