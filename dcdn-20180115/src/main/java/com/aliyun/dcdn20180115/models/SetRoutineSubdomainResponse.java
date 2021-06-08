// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetRoutineSubdomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SetRoutineSubdomainResponse setBody(SetRoutineSubdomainResponseBody body) {
        this.body = body;
        return this;
    }
    public SetRoutineSubdomainResponseBody getBody() {
        return this.body;
    }

}
