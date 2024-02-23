// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskCallListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRobotTaskCallListResponseBody body;

    public static QueryRobotTaskCallListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotTaskCallListResponse self = new QueryRobotTaskCallListResponse();
        return TeaModel.build(map, self);
    }

    public QueryRobotTaskCallListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRobotTaskCallListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRobotTaskCallListResponse setBody(QueryRobotTaskCallListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRobotTaskCallListResponseBody getBody() {
        return this.body;
    }

}
