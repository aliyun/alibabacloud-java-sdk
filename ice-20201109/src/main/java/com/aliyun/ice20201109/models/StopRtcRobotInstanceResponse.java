// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StopRtcRobotInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopRtcRobotInstanceResponseBody body;

    public static StopRtcRobotInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopRtcRobotInstanceResponse self = new StopRtcRobotInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopRtcRobotInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopRtcRobotInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopRtcRobotInstanceResponse setBody(StopRtcRobotInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopRtcRobotInstanceResponseBody getBody() {
        return this.body;
    }

}
