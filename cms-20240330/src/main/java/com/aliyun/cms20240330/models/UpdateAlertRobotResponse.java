// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateAlertRobotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAlertRobotResponseBody body;

    public static UpdateAlertRobotResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertRobotResponse self = new UpdateAlertRobotResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlertRobotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlertRobotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAlertRobotResponse setBody(UpdateAlertRobotResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAlertRobotResponseBody getBody() {
        return this.body;
    }

}
