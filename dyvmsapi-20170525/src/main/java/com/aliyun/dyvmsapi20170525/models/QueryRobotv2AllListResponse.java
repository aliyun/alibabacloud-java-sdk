// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotv2AllListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRobotv2AllListResponseBody body;

    public static QueryRobotv2AllListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotv2AllListResponse self = new QueryRobotv2AllListResponse();
        return TeaModel.build(map, self);
    }

    public QueryRobotv2AllListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRobotv2AllListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRobotv2AllListResponse setBody(QueryRobotv2AllListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRobotv2AllListResponseBody getBody() {
        return this.body;
    }

}
