// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CancelRobotTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelRobotTaskResponseBody body;

    public static CancelRobotTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelRobotTaskResponse self = new CancelRobotTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelRobotTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelRobotTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelRobotTaskResponse setBody(CancelRobotTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelRobotTaskResponseBody getBody() {
        return this.body;
    }

}
