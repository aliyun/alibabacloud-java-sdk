// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class EnableAlarmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableAlarmResponseBody body;

    public static EnableAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAlarmResponse self = new EnableAlarmResponse();
        return TeaModel.build(map, self);
    }

    public EnableAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableAlarmResponse setBody(EnableAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAlarmResponseBody getBody() {
        return this.body;
    }

}
