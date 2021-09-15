// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class StartAppServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartAppServerResponseBody body;

    public static StartAppServerResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAppServerResponse self = new StartAppServerResponse();
        return TeaModel.build(map, self);
    }

    public StartAppServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAppServerResponse setBody(StartAppServerResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAppServerResponseBody getBody() {
        return this.body;
    }

}
