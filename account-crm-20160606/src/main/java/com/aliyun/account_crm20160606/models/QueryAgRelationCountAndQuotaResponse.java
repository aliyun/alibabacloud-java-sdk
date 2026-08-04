// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAgRelationCountAndQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAgRelationCountAndQuotaResponseBody body;

    public static QueryAgRelationCountAndQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAgRelationCountAndQuotaResponse self = new QueryAgRelationCountAndQuotaResponse();
        return TeaModel.build(map, self);
    }

    public QueryAgRelationCountAndQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAgRelationCountAndQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAgRelationCountAndQuotaResponse setBody(QueryAgRelationCountAndQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAgRelationCountAndQuotaResponseBody getBody() {
        return this.body;
    }

}
