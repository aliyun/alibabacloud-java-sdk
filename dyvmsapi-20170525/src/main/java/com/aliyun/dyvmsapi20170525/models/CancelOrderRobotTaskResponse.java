// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CancelOrderRobotTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelOrderRobotTaskResponseBody body;

    public static CancelOrderRobotTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelOrderRobotTaskResponse self = new CancelOrderRobotTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelOrderRobotTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelOrderRobotTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelOrderRobotTaskResponse setBody(CancelOrderRobotTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelOrderRobotTaskResponseBody getBody() {
        return this.body;
    }

}
