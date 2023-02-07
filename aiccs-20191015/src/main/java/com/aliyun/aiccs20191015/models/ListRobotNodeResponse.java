// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListRobotNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListRobotNodeResponseBody body;

    public static ListRobotNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRobotNodeResponse self = new ListRobotNodeResponse();
        return TeaModel.build(map, self);
    }

    public ListRobotNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRobotNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRobotNodeResponse setBody(ListRobotNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRobotNodeResponseBody getBody() {
        return this.body;
    }

}
