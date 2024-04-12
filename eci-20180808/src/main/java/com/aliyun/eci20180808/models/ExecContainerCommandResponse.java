// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class ExecContainerCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ExecContainerCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecContainerCommandResponse setBody(ExecContainerCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecContainerCommandResponseBody getBody() {
        return this.body;
    }

}
