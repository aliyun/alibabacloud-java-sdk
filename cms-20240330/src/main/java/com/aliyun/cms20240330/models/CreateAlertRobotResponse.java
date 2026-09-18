// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateAlertRobotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAlertRobotResponseBody body;

    public static CreateAlertRobotResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertRobotResponse self = new CreateAlertRobotResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlertRobotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlertRobotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAlertRobotResponse setBody(CreateAlertRobotResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlertRobotResponseBody getBody() {
        return this.body;
    }

}
