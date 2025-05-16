// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryExportDomainExpireSnatchsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryExportDomainExpireSnatchsResponseBody body;

    public static QueryExportDomainExpireSnatchsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExportDomainExpireSnatchsResponse self = new QueryExportDomainExpireSnatchsResponse();
        return TeaModel.build(map, self);
    }

    public QueryExportDomainExpireSnatchsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExportDomainExpireSnatchsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExportDomainExpireSnatchsResponse setBody(QueryExportDomainExpireSnatchsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExportDomainExpireSnatchsResponseBody getBody() {
        return this.body;
    }

}
