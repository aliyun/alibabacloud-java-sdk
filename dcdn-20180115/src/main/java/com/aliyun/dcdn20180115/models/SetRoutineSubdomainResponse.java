// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetRoutineSubdomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetRoutineSubdomainResponseBody body;

    public static SetRoutineSubdomainResponse build(java.util.Map<String, ?> map) throws Exception {
        SetRoutineSubdomainResponse self = new SetRoutineSubdomainResponse();
        return TeaModel.build(map, self);
    }

    public SetRoutineSubdomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetRoutineSubdomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetRoutineSubdomainResponse setBody(SetRoutineSubdomainResponseBody body) {
        this.body = body;
        return this;
    }
    public SetRoutineSubdomainResponseBody getBody() {
        return this.body;
    }

}
