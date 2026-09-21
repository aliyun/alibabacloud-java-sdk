// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetRoutineEnvironmentVariablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetRoutineEnvironmentVariablesResponseBody body;

    public static SetRoutineEnvironmentVariablesResponse build(java.util.Map<String, ?> map) throws Exception {
        SetRoutineEnvironmentVariablesResponse self = new SetRoutineEnvironmentVariablesResponse();
        return TeaModel.build(map, self);
    }

    public SetRoutineEnvironmentVariablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetRoutineEnvironmentVariablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetRoutineEnvironmentVariablesResponse setBody(SetRoutineEnvironmentVariablesResponseBody body) {
        this.body = body;
        return this;
    }
    public SetRoutineEnvironmentVariablesResponseBody getBody() {
        return this.body;
    }

}
