// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryEnsAssociationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryEnsAssociationResponse setBody(QueryEnsAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEnsAssociationResponseBody getBody() {
        return this.body;
    }

}
