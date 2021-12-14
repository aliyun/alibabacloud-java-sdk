// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class Apply400ManagerIdentifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Apply400ManagerIdentifyResponseBody body;

    public static Apply400ManagerIdentifyResponse build(java.util.Map<String, ?> map) throws Exception {
        Apply400ManagerIdentifyResponse self = new Apply400ManagerIdentifyResponse();
        return TeaModel.build(map, self);
    }

    public Apply400ManagerIdentifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Apply400ManagerIdentifyResponse setBody(Apply400ManagerIdentifyResponseBody body) {
        this.body = body;
        return this;
    }
    public Apply400ManagerIdentifyResponseBody getBody() {
        return this.body;
    }

}
