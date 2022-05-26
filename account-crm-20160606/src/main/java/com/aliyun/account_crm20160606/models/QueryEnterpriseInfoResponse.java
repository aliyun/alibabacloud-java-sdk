// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryEnterpriseInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEnterpriseInfoResponseBody body;

    public static QueryEnterpriseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseInfoResponse self = new QueryEnterpriseInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEnterpriseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEnterpriseInfoResponse setBody(QueryEnterpriseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEnterpriseInfoResponseBody getBody() {
        return this.body;
    }

}
