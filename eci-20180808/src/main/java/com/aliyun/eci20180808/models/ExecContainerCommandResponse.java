// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class ExecContainerCommandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecContainerCommandResponseBody body;

    public static ExecContainerCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecContainerCommandResponse self = new ExecContainerCommandResponse();
        return TeaModel.build(map, self);
    }

    public ExecContainerCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecContainerCommandResponse setBody(ExecContainerCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecContainerCommandResponseBody getBody() {
        return this.body;
    }

}
