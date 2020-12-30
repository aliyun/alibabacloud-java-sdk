// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryDomainByParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDomainByParamResponseBody body;

    public static QueryDomainByParamResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainByParamResponse self = new QueryDomainByParamResponse();
        return TeaModel.build(map, self);
    }

    public QueryDomainByParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDomainByParamResponse setBody(QueryDomainByParamResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDomainByParamResponseBody getBody() {
        return this.body;
    }

}
