// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAgSecurityMobileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAgSecurityMobileResponseBody body;

    public static QueryAgSecurityMobileResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAgSecurityMobileResponse self = new QueryAgSecurityMobileResponse();
        return TeaModel.build(map, self);
    }

    public QueryAgSecurityMobileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAgSecurityMobileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAgSecurityMobileResponse setBody(QueryAgSecurityMobileResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAgSecurityMobileResponseBody getBody() {
        return this.body;
    }

}
