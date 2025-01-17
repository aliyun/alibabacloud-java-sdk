// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryGuideItemGroupForCrowdOperationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryGuideItemGroupForCrowdOperationResponseBody body;

    public static QueryGuideItemGroupForCrowdOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGuideItemGroupForCrowdOperationResponse self = new QueryGuideItemGroupForCrowdOperationResponse();
        return TeaModel.build(map, self);
    }

    public QueryGuideItemGroupForCrowdOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGuideItemGroupForCrowdOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGuideItemGroupForCrowdOperationResponse setBody(QueryGuideItemGroupForCrowdOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGuideItemGroupForCrowdOperationResponseBody getBody() {
        return this.body;
    }

}
