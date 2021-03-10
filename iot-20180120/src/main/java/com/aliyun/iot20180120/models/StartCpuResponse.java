// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class StartCpuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartCpuResponseBody body;

    public static StartCpuResponse build(java.util.Map<String, ?> map) throws Exception {
        StartCpuResponse self = new StartCpuResponse();
        return TeaModel.build(map, self);
    }

    public StartCpuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartCpuResponse setBody(StartCpuResponseBody body) {
        this.body = body;
        return this;
    }
    public StartCpuResponseBody getBody() {
        return this.body;
    }

}
