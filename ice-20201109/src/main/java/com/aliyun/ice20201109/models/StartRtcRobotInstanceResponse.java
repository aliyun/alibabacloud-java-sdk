// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartRtcRobotInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartRtcRobotInstanceResponseBody body;

    public static StartRtcRobotInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRtcRobotInstanceResponse self = new StartRtcRobotInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartRtcRobotInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartRtcRobotInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartRtcRobotInstanceResponse setBody(StartRtcRobotInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartRtcRobotInstanceResponseBody getBody() {
        return this.body;
    }

}
