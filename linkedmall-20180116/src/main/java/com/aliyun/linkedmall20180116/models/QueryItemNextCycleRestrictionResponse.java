// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemNextCycleRestrictionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryItemNextCycleRestrictionResponseBody body;

    public static QueryItemNextCycleRestrictionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryItemNextCycleRestrictionResponse self = new QueryItemNextCycleRestrictionResponse();
        return TeaModel.build(map, self);
    }

    public QueryItemNextCycleRestrictionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryItemNextCycleRestrictionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryItemNextCycleRestrictionResponse setBody(QueryItemNextCycleRestrictionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryItemNextCycleRestrictionResponseBody getBody() {
        return this.body;
    }

}
