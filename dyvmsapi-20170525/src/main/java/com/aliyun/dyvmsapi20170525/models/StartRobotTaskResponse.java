// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class StartRobotTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartRobotTaskResponseBody body;

    public static StartRobotTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRobotTaskResponse self = new StartRobotTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartRobotTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartRobotTaskResponse setBody(StartRobotTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartRobotTaskResponseBody getBody() {
        return this.body;
    }

}
