// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ModifyScheduleExecuteTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyScheduleExecuteTimeResponseBody body;

    public static ModifyScheduleExecuteTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyScheduleExecuteTimeResponse self = new ModifyScheduleExecuteTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyScheduleExecuteTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyScheduleExecuteTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyScheduleExecuteTimeResponse setBody(ModifyScheduleExecuteTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyScheduleExecuteTimeResponseBody getBody() {
        return this.body;
    }

}
