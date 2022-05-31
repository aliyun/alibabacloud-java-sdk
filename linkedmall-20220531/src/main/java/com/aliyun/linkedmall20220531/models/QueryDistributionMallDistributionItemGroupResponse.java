// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributionMallDistributionItemGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDistributionMallDistributionItemGroupResponseBody body;

    public static QueryDistributionMallDistributionItemGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionMallDistributionItemGroupResponse self = new QueryDistributionMallDistributionItemGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryDistributionMallDistributionItemGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDistributionMallDistributionItemGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDistributionMallDistributionItemGroupResponse setBody(QueryDistributionMallDistributionItemGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDistributionMallDistributionItemGroupResponseBody getBody() {
        return this.body;
    }

}
