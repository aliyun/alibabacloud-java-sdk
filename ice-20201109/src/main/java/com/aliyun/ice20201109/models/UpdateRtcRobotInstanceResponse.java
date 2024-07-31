// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateRtcRobotInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRtcRobotInstanceResponseBody body;

    public static UpdateRtcRobotInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRtcRobotInstanceResponse self = new UpdateRtcRobotInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRtcRobotInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRtcRobotInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRtcRobotInstanceResponse setBody(UpdateRtcRobotInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRtcRobotInstanceResponseBody getBody() {
        return this.body;
    }

}
