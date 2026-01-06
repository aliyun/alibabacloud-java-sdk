// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryRobotUnsubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRobotUnsubscriptionResponseBody body;

    public static QueryRobotUnsubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotUnsubscriptionResponse self = new QueryRobotUnsubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public QueryRobotUnsubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRobotUnsubscriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRobotUnsubscriptionResponse setBody(QueryRobotUnsubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRobotUnsubscriptionResponseBody getBody() {
        return this.body;
    }

}
