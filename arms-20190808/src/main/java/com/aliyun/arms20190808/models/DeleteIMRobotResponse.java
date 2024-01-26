// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteIMRobotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteIMRobotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIMRobotResponse setBody(DeleteIMRobotResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIMRobotResponseBody getBody() {
        return this.body;
    }

}
