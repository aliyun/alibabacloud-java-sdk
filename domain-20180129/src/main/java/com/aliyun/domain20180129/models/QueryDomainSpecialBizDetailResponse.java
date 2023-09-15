// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainSpecialBizDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDomainSpecialBizDetailResponseBody body;

    public static QueryDomainSpecialBizDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainSpecialBizDetailResponse self = new QueryDomainSpecialBizDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryDomainSpecialBizDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDomainSpecialBizDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDomainSpecialBizDetailResponse setBody(QueryDomainSpecialBizDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDomainSpecialBizDetailResponseBody getBody() {
        return this.body;
    }

}
