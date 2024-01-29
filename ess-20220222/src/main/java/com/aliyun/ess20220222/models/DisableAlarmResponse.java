// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DisableAlarmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableAlarmResponseBody body;

    public static DisableAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableAlarmResponse self = new DisableAlarmResponse();
        return TeaModel.build(map, self);
    }

    public DisableAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableAlarmResponse setBody(DisableAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableAlarmResponseBody getBody() {
        return this.body;
    }

}
