// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class BridgeRtcCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BridgeRtcCallResponseBody body;

    public static BridgeRtcCallResponse build(java.util.Map<String, ?> map) throws Exception {
        BridgeRtcCallResponse self = new BridgeRtcCallResponse();
        return TeaModel.build(map, self);
    }

    public BridgeRtcCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BridgeRtcCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BridgeRtcCallResponse setBody(BridgeRtcCallResponseBody body) {
        this.body = body;
        return this;
    }
    public BridgeRtcCallResponseBody getBody() {
        return this.body;
    }

}
