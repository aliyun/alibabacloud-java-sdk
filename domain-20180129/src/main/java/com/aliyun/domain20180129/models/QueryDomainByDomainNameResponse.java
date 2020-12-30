// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainByDomainNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDomainByDomainNameResponseBody body;

    public static QueryDomainByDomainNameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainByDomainNameResponse self = new QueryDomainByDomainNameResponse();
        return TeaModel.build(map, self);
    }

    public QueryDomainByDomainNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDomainByDomainNameResponse setBody(QueryDomainByDomainNameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDomainByDomainNameResponseBody getBody() {
        return this.body;
    }

}
