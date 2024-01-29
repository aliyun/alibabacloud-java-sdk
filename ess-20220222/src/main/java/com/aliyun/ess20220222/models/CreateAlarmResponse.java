// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateAlarmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAlarmResponseBody body;

    public static CreateAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlarmResponse self = new CreateAlarmResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAlarmResponse setBody(CreateAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlarmResponseBody getBody() {
        return this.body;
    }

}
