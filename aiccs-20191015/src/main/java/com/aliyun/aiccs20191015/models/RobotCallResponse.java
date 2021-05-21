// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class RobotCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RobotCallResponseBody body;

    public static RobotCallResponse build(java.util.Map<String, ?> map) throws Exception {
        RobotCallResponse self = new RobotCallResponse();
        return TeaModel.build(map, self);
    }

    public RobotCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RobotCallResponse setBody(RobotCallResponseBody body) {
        this.body = body;
        return this;
    }
    public RobotCallResponseBody getBody() {
        return this.body;
    }

}
