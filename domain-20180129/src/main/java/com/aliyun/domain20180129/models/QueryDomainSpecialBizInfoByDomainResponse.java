// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainSpecialBizInfoByDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDomainSpecialBizInfoByDomainResponseBody body;

    public static QueryDomainSpecialBizInfoByDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainSpecialBizInfoByDomainResponse self = new QueryDomainSpecialBizInfoByDomainResponse();
        return TeaModel.build(map, self);
    }

    public QueryDomainSpecialBizInfoByDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDomainSpecialBizInfoByDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDomainSpecialBizInfoByDomainResponse setBody(QueryDomainSpecialBizInfoByDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDomainSpecialBizInfoByDomainResponseBody getBody() {
        return this.body;
    }

}
