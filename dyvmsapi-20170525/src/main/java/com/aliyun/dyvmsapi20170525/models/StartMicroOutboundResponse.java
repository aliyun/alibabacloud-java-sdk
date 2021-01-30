// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class StartMicroOutboundResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartMicroOutboundResponseBody body;

    public static StartMicroOutboundResponse build(java.util.Map<String, ?> map) throws Exception {
        StartMicroOutboundResponse self = new StartMicroOutboundResponse();
        return TeaModel.build(map, self);
    }

    public StartMicroOutboundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartMicroOutboundResponse setBody(StartMicroOutboundResponseBody body) {
        this.body = body;
        return this;
    }
    public StartMicroOutboundResponseBody getBody() {
        return this.body;
    }

}
