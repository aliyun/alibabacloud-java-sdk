// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SaveTerminalLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveTerminalLogResponseBody body;

    public static SaveTerminalLogResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveTerminalLogResponse self = new SaveTerminalLogResponse();
        return TeaModel.build(map, self);
    }

    public SaveTerminalLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveTerminalLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveTerminalLogResponse setBody(SaveTerminalLogResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveTerminalLogResponseBody getBody() {
        return this.body;
    }

}
