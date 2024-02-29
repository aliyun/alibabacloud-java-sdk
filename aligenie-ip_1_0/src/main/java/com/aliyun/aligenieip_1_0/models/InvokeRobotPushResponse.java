// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class InvokeRobotPushResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvokeRobotPushResponseBody body;

    public static InvokeRobotPushResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeRobotPushResponse self = new InvokeRobotPushResponse();
        return TeaModel.build(map, self);
    }

    public InvokeRobotPushResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeRobotPushResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvokeRobotPushResponse setBody(InvokeRobotPushResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeRobotPushResponseBody getBody() {
        return this.body;
    }

}
