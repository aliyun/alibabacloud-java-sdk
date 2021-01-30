// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateRobotTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRobotTaskResponseBody body;

    public static CreateRobotTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRobotTaskResponse self = new CreateRobotTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateRobotTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRobotTaskResponse setBody(CreateRobotTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRobotTaskResponseBody getBody() {
        return this.body;
    }

}
