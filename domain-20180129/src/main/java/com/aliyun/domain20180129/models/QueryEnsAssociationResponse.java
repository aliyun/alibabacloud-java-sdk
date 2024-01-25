// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryEnsAssociationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEnsAssociationResponseBody body;

    public static QueryEnsAssociationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEnsAssociationResponse self = new QueryEnsAssociationResponse();
        return TeaModel.build(map, self);
    }

    public QueryEnsAssociationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEnsAssociationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEnsAssociationResponse setBody(QueryEnsAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEnsAssociationResponseBody getBody() {
        return this.body;
    }

}
