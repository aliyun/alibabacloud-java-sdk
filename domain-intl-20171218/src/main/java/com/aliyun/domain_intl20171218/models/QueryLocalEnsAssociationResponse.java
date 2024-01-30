// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryLocalEnsAssociationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryLocalEnsAssociationResponseBody body;

    public static QueryLocalEnsAssociationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLocalEnsAssociationResponse self = new QueryLocalEnsAssociationResponse();
        return TeaModel.build(map, self);
    }

    public QueryLocalEnsAssociationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLocalEnsAssociationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLocalEnsAssociationResponse setBody(QueryLocalEnsAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLocalEnsAssociationResponseBody getBody() {
        return this.body;
    }

}
