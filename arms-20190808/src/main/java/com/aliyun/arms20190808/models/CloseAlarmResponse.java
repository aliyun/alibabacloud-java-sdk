// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CloseAlarmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CloseAlarmResponseBody body;

    public static CloseAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseAlarmResponse self = new CloseAlarmResponse();
        return TeaModel.build(map, self);
    }

    public CloseAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseAlarmResponse setBody(CloseAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseAlarmResponseBody getBody() {
        return this.body;
    }

}
