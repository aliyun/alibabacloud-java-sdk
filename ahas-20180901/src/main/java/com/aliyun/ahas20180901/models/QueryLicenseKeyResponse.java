// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryLicenseKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLicenseKeyResponseBody body;

    public static QueryLicenseKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLicenseKeyResponse self = new QueryLicenseKeyResponse();
        return TeaModel.build(map, self);
    }

    public QueryLicenseKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLicenseKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLicenseKeyResponse setBody(QueryLicenseKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLicenseKeyResponseBody getBody() {
        return this.body;
    }

}
