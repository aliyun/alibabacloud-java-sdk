// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryGuideItemGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryGuideItemGroupResponseBody body;

    public static QueryGuideItemGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGuideItemGroupResponse self = new QueryGuideItemGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryGuideItemGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGuideItemGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGuideItemGroupResponse setBody(QueryGuideItemGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGuideItemGroupResponseBody getBody() {
        return this.body;
    }

}
