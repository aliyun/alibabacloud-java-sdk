// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryRobotListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRobotListResponseBody body;

    public static QueryRobotListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotListResponse self = new QueryRobotListResponse();
        return TeaModel.build(map, self);
    }

    public QueryRobotListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRobotListResponse setBody(QueryRobotListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRobotListResponseBody getBody() {
        return this.body;
    }

}
