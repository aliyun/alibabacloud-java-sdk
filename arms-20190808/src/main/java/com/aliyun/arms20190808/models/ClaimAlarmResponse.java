// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ClaimAlarmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClaimAlarmResponseBody body;

    public static ClaimAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        ClaimAlarmResponse self = new ClaimAlarmResponse();
        return TeaModel.build(map, self);
    }

    public ClaimAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClaimAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClaimAlarmResponse setBody(ClaimAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public ClaimAlarmResponseBody getBody() {
        return this.body;
    }

}
