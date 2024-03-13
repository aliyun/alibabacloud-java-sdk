// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetResellerUserAlarmThresholdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetResellerUserAlarmThresholdResponseBody body;

    public static SetResellerUserAlarmThresholdResponse build(java.util.Map<String, ?> map) throws Exception {
        SetResellerUserAlarmThresholdResponse self = new SetResellerUserAlarmThresholdResponse();
        return TeaModel.build(map, self);
    }

    public SetResellerUserAlarmThresholdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetResellerUserAlarmThresholdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetResellerUserAlarmThresholdResponse setBody(SetResellerUserAlarmThresholdResponseBody body) {
        this.body = body;
        return this;
    }
    public SetResellerUserAlarmThresholdResponseBody getBody() {
        return this.body;
    }

}
