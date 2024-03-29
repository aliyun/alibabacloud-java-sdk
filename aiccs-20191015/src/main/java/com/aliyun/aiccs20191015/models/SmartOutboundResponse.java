// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class SmartOutboundResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SmartOutboundResponseBody body;

    public static SmartOutboundResponse build(java.util.Map<String, ?> map) throws Exception {
        SmartOutboundResponse self = new SmartOutboundResponse();
        return TeaModel.build(map, self);
    }

    public SmartOutboundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SmartOutboundResponse setBody(SmartOutboundResponseBody body) {
        this.body = body;
        return this;
    }
    public SmartOutboundResponseBody getBody() {
        return this.body;
    }

}
