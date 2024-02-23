// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRobotTaskListResponseBody body;

    public static QueryRobotTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotTaskListResponse self = new QueryRobotTaskListResponse();
        return TeaModel.build(map, self);
    }

    public QueryRobotTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRobotTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRobotTaskListResponse setBody(QueryRobotTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRobotTaskListResponseBody getBody() {
        return this.body;
    }

}
