// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartTaskByAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartTaskByAppResponseBody body;

    public static StartTaskByAppResponse build(java.util.Map<String, ?> map) throws Exception {
        StartTaskByAppResponse self = new StartTaskByAppResponse();
        return TeaModel.build(map, self);
    }

    public StartTaskByAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartTaskByAppResponse setBody(StartTaskByAppResponseBody body) {
        this.body = body;
        return this;
    }
    public StartTaskByAppResponseBody getBody() {
        return this.body;
    }

}
