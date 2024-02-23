// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRobotTaskDetailResponseBody body;

    public static QueryRobotTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotTaskDetailResponse self = new QueryRobotTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryRobotTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRobotTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRobotTaskDetailResponse setBody(QueryRobotTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRobotTaskDetailResponseBody getBody() {
        return this.body;
    }

}
