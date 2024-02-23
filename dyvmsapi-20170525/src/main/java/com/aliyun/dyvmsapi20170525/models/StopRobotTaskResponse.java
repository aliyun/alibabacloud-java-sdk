// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class StopRobotTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopRobotTaskResponseBody body;

    public static StopRobotTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopRobotTaskResponse self = new StopRobotTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopRobotTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopRobotTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopRobotTaskResponse setBody(StopRobotTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopRobotTaskResponseBody getBody() {
        return this.body;
    }

}
