// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunHotwordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunHotwordResponseBody body;

    public static RunHotwordResponse build(java.util.Map<String, ?> map) throws Exception {
        RunHotwordResponse self = new RunHotwordResponse();
        return TeaModel.build(map, self);
    }

    public RunHotwordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunHotwordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunHotwordResponse setBody(RunHotwordResponseBody body) {
        this.body = body;
        return this;
    }
    public RunHotwordResponseBody getBody() {
        return this.body;
    }

}
