// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SaveTerminalLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SaveTerminalLogResponse setBody(SaveTerminalLogResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveTerminalLogResponseBody getBody() {
        return this.body;
    }

}
