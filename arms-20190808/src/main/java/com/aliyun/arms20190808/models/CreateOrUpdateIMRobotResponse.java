// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateIMRobotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOrUpdateIMRobotResponseBody body;

    public static CreateOrUpdateIMRobotResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateIMRobotResponse self = new CreateOrUpdateIMRobotResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateIMRobotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrUpdateIMRobotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrUpdateIMRobotResponse setBody(CreateOrUpdateIMRobotResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateIMRobotResponseBody getBody() {
        return this.body;
    }

}
