// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryChannelDistributionItemGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryChannelDistributionItemGroupResponseBody body;

    public static QueryChannelDistributionItemGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryChannelDistributionItemGroupResponse self = new QueryChannelDistributionItemGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryChannelDistributionItemGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryChannelDistributionItemGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryChannelDistributionItemGroupResponse setBody(QueryChannelDistributionItemGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryChannelDistributionItemGroupResponseBody getBody() {
        return this.body;
    }

}
