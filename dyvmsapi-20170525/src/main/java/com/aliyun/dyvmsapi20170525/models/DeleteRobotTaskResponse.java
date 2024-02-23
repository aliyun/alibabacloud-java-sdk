// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteRobotTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRobotTaskResponseBody body;

    public static DeleteRobotTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRobotTaskResponse self = new DeleteRobotTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRobotTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRobotTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRobotTaskResponse setBody(DeleteRobotTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRobotTaskResponseBody getBody() {
        return this.body;
    }

}
