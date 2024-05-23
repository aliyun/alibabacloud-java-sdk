// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class ModifyScheduledTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyScheduledTaskResponseBody body;

    public static ModifyScheduledTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyScheduledTaskResponse self = new ModifyScheduledTaskResponse();
        return TeaModel.build(map, self);
    }

    public ModifyScheduledTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyScheduledTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyScheduledTaskResponse setBody(ModifyScheduledTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyScheduledTaskResponseBody getBody() {
        return this.body;
    }

}
