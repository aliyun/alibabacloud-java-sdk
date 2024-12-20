// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListAiccsRobotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAiccsRobotResponseBody body;

    public static ListAiccsRobotResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAiccsRobotResponse self = new ListAiccsRobotResponse();
        return TeaModel.build(map, self);
    }

    public ListAiccsRobotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAiccsRobotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAiccsRobotResponse setBody(ListAiccsRobotResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAiccsRobotResponseBody getBody() {
        return this.body;
    }

}
