// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineEnvironmentVariablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRoutineEnvironmentVariablesResponseBody body;

    public static ListRoutineEnvironmentVariablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRoutineEnvironmentVariablesResponse self = new ListRoutineEnvironmentVariablesResponse();
        return TeaModel.build(map, self);
    }

    public ListRoutineEnvironmentVariablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRoutineEnvironmentVariablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRoutineEnvironmentVariablesResponse setBody(ListRoutineEnvironmentVariablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRoutineEnvironmentVariablesResponseBody getBody() {
        return this.body;
    }

}
