// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVirtualNumberRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryVirtualNumberRelationResponseBody body;

    public static QueryVirtualNumberRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVirtualNumberRelationResponse self = new QueryVirtualNumberRelationResponse();
        return TeaModel.build(map, self);
    }

    public QueryVirtualNumberRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVirtualNumberRelationResponse setBody(QueryVirtualNumberRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVirtualNumberRelationResponseBody getBody() {
        return this.body;
    }

}
