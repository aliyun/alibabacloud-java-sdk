// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CancelOrderRobotTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CancelOrderRobotTaskResponse setBody(CancelOrderRobotTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelOrderRobotTaskResponseBody getBody() {
        return this.body;
    }

}
