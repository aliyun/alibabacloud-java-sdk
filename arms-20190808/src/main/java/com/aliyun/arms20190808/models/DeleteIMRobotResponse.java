// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteIMRobotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIMRobotResponseBody body;

    public static DeleteIMRobotResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIMRobotResponse self = new DeleteIMRobotResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIMRobotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIMRobotResponse setBody(DeleteIMRobotResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIMRobotResponseBody getBody() {
        return this.body;
    }

}
