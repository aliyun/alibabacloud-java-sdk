// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class StartDesktopsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartDesktopsResponseBody body;

    public static StartDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDesktopsResponse self = new StartDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public StartDesktopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDesktopsResponse setBody(StartDesktopsResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDesktopsResponseBody getBody() {
        return this.body;
    }

}
