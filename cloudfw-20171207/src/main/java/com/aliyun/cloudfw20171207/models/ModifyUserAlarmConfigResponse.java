// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyUserAlarmConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUserAlarmConfigResponseBody body;

    public static ModifyUserAlarmConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserAlarmConfigResponse self = new ModifyUserAlarmConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserAlarmConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserAlarmConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUserAlarmConfigResponse setBody(ModifyUserAlarmConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserAlarmConfigResponseBody getBody() {
        return this.body;
    }

}
