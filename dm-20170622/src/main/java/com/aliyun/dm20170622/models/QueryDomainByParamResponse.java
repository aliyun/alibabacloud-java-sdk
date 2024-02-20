// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class QueryDomainByParamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryDomainByParamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDomainByParamResponse setBody(QueryDomainByParamResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDomainByParamResponseBody getBody() {
        return this.body;
    }

}
