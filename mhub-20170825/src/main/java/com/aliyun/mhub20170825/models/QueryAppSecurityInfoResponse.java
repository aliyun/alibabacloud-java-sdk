// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryAppSecurityInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAppSecurityInfoResponseBody body;

    public static QueryAppSecurityInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppSecurityInfoResponse self = new QueryAppSecurityInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppSecurityInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAppSecurityInfoResponse setBody(QueryAppSecurityInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAppSecurityInfoResponseBody getBody() {
        return this.body;
    }

}
