// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryWorkOrdAuditListNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryWorkOrdAuditListNewResponseBody body;

    public static QueryWorkOrdAuditListNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWorkOrdAuditListNewResponse self = new QueryWorkOrdAuditListNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryWorkOrdAuditListNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryWorkOrdAuditListNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryWorkOrdAuditListNewResponse setBody(QueryWorkOrdAuditListNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWorkOrdAuditListNewResponseBody getBody() {
        return this.body;
    }

}
