// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioAppDomainListOpenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryStudioAppDomainListOpenResponseBody body;

    public static QueryStudioAppDomainListOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStudioAppDomainListOpenResponse self = new QueryStudioAppDomainListOpenResponse();
        return TeaModel.build(map, self);
    }

    public QueryStudioAppDomainListOpenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStudioAppDomainListOpenResponse setBody(QueryStudioAppDomainListOpenResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStudioAppDomainListOpenResponseBody getBody() {
        return this.body;
    }

}
