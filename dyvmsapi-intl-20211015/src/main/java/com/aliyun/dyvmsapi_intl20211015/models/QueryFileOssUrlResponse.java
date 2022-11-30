// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class QueryFileOssUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFileOssUrlResponseBody body;

    public static QueryFileOssUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFileOssUrlResponse self = new QueryFileOssUrlResponse();
        return TeaModel.build(map, self);
    }

    public QueryFileOssUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFileOssUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFileOssUrlResponse setBody(QueryFileOssUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFileOssUrlResponseBody getBody() {
        return this.body;
    }

}
