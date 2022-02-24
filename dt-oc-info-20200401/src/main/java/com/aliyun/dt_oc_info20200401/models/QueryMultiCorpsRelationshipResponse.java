// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class QueryMultiCorpsRelationshipResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMultiCorpsRelationshipResponseBody body;

    public static QueryMultiCorpsRelationshipResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMultiCorpsRelationshipResponse self = new QueryMultiCorpsRelationshipResponse();
        return TeaModel.build(map, self);
    }

    public QueryMultiCorpsRelationshipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMultiCorpsRelationshipResponse setBody(QueryMultiCorpsRelationshipResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMultiCorpsRelationshipResponseBody getBody() {
        return this.body;
    }

}
