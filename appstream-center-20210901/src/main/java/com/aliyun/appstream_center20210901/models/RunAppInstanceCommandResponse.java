// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RunAppInstanceCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunAppInstanceCommandResponseBody body;

    public static RunAppInstanceCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        RunAppInstanceCommandResponse self = new RunAppInstanceCommandResponse();
        return TeaModel.build(map, self);
    }

    public RunAppInstanceCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunAppInstanceCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunAppInstanceCommandResponse setBody(RunAppInstanceCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public RunAppInstanceCommandResponseBody getBody() {
        return this.body;
    }

}
