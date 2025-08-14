// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CloseMediaConnectFlowFailoverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseMediaConnectFlowFailoverResponseBody body;

    public static CloseMediaConnectFlowFailoverResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseMediaConnectFlowFailoverResponse self = new CloseMediaConnectFlowFailoverResponse();
        return TeaModel.build(map, self);
    }

    public CloseMediaConnectFlowFailoverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseMediaConnectFlowFailoverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseMediaConnectFlowFailoverResponse setBody(CloseMediaConnectFlowFailoverResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseMediaConnectFlowFailoverResponseBody getBody() {
        return this.body;
    }

}
