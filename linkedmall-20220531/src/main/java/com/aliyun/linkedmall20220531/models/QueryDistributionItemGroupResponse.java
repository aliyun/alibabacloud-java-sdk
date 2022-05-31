// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributionItemGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDistributionItemGroupResponseBody body;

    public static QueryDistributionItemGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionItemGroupResponse self = new QueryDistributionItemGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryDistributionItemGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDistributionItemGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDistributionItemGroupResponse setBody(QueryDistributionItemGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDistributionItemGroupResponseBody getBody() {
        return this.body;
    }

}
