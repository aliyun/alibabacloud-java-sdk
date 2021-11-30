// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class StartServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartServiceResponseBody body;

    public static StartServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartServiceResponse self = new StartServiceResponse();
        return TeaModel.build(map, self);
    }

    public StartServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartServiceResponse setBody(StartServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartServiceResponseBody getBody() {
        return this.body;
    }

}
