// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class QueryTimedResetOperateStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTimedResetOperateStatusResponseBody body;

    public static QueryTimedResetOperateStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTimedResetOperateStatusResponse self = new QueryTimedResetOperateStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryTimedResetOperateStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTimedResetOperateStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTimedResetOperateStatusResponse setBody(QueryTimedResetOperateStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTimedResetOperateStatusResponseBody getBody() {
        return this.body;
    }

}
