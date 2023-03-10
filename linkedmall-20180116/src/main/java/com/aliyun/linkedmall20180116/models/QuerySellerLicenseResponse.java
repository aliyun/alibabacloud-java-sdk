// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QuerySellerLicenseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySellerLicenseResponseBody body;

    public static QuerySellerLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySellerLicenseResponse self = new QuerySellerLicenseResponse();
        return TeaModel.build(map, self);
    }

    public QuerySellerLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySellerLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySellerLicenseResponse setBody(QuerySellerLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySellerLicenseResponseBody getBody() {
        return this.body;
    }

}
