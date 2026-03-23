// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RunSyncCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunSyncCommandResponseBody body;

    public static RunSyncCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        RunSyncCommandResponse self = new RunSyncCommandResponse();
        return TeaModel.build(map, self);
    }

    public RunSyncCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunSyncCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunSyncCommandResponse setBody(RunSyncCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public RunSyncCommandResponseBody getBody() {
        return this.body;
    }

}
