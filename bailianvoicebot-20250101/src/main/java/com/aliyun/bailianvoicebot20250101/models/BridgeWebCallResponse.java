// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class BridgeWebCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BridgeWebCallResponseBody body;

    public static BridgeWebCallResponse build(java.util.Map<String, ?> map) throws Exception {
        BridgeWebCallResponse self = new BridgeWebCallResponse();
        return TeaModel.build(map, self);
    }

    public BridgeWebCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BridgeWebCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BridgeWebCallResponse setBody(BridgeWebCallResponseBody body) {
        this.body = body;
        return this;
    }
    public BridgeWebCallResponseBody getBody() {
        return this.body;
    }

}
